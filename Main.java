package Logic;

public class Main {

	// This is the configuration for a 'D' Latch
	
	//These are the components of the circuit
	private static AND AND1 = new AND();
	private static AND AND2 = new AND();
	private static NOR NOR1 = new NOR();
	private static NOR NOR2 = new NOR();
	private static NOT NOT1 = new NOT();
	private static Node D = new Node();
	private static Node EN = new Node();
	private static LED Q = new LED();
	private static LED Q2 = new LED();

	//These are the wires that connect the components together
	private static Wire wire1 = new Wire();
	private static Wire wire2 = new Wire();
	private static Wire wire3 = new Wire();
//	private static Wire wire4 = new Wire();
	private static Wire wire5 = new Wire();
	private static Wire wire6 = new Wire();
	private static Wire wire7 = new Wire();
	private static Wire wire8 = new Wire();
	private static Wire wire9 = new Wire();
	private static Wire wire10 = new Wire();
	private static Wire wire11 = new Wire();
	private static Wire wire12 = new Wire();
	
	public static void main(String[] args) {

		//This is how we connect the wires to the components
		wire1.connect(D.getOutput(), AND2.getInput2());
		wire2.connect(D.getOutput(), NOT1.getInput());
		wire3.connect(NOT1.getOutput(), AND1.getInput1());
		wire5.connect(EN.getOutput(), AND1.getInput2());
		wire6.connect(EN.getOutput(), AND2.getInput1());
		wire7.connect(AND1.getOutput(), NOR1.getInput1());
		wire8.connect(NOR2.getOutput(), NOR1.getInput2());
		wire9.connect(NOR1.getOutput(), NOR2.getInput1());
		wire10.connect(AND2.getOutput(), NOR2.getInput2());
		wire11.connect(NOR1.getOutput(), Q.getInput());
		wire12.connect(NOR2.getOutput(), Q2.getInput());

		//This is how we set the initial values of the inputs
		// First, both the Data and Enable inputs are LOW
		D.setOutputValue(0);
		EN.setOutputValue(0);
		
		// This is to run through the circuit and print the outcome
		run();

		// Data input is set to HIGH
		D.setOutputValue(1);
		run();

		// Enable input is set to HIGH
		EN.setOutputValue(1);
		run();

		// Enable input is set to LOW
		// After that, Q should have remained ON
		EN.setOutputValue(0);
		run();

		// Data input is set to LOW
		// should be no change
		D.setOutputValue(0);
		run();
		
		// Enable input is set to HIGH
		// Now setting Enable HIGH while Data is Low should switch Q OFF
		EN.setOutputValue(1);
		run();

		// Enable input is set to LOW
		// should be no change
		EN.setOutputValue(0);
		run();

		// Enable input is set to HIGH again
		// should be no change, since the Data input is still LOW
		EN.setOutputValue(1);
		run();

		// Data input is set to HIGH
		// Q should switch ON
		D.setOutputValue(1);
		run();
		
		// Data input is set to LOW
		// Q should switch OFF
		D.setOutputValue(0);
		run();
		
		// Data input is set to HIGH
		// Q should switch ON
		D.setOutputValue(1);
		run();
		
		// Enable input is set to LOW again
		// should be no change, since the Enable is no longer HIGH
		EN.setOutputValue(0);
		run();

		// Data input is set to LOW
		// should be no change
		D.setOutputValue(0);
		run();
		
	}

	static void run() {
		//This is how we evaluate the conditions of the parts - the order is important
		wire1.evaluate();
		wire2.evaluate();
		NOT1.evaluate();
		wire3.evaluate();
		wire5.evaluate();
		wire6.evaluate();
		AND1.evaluate();
		AND2.evaluate();
		wire7.evaluate();
		wire10.evaluate();
		NOR1.evaluate();
		wire9.evaluate();
		NOR2.evaluate();
		wire8.evaluate();
		NOR1.evaluate();
		wire9.evaluate();
		NOR2.evaluate();
		wire11.evaluate();
		wire12.evaluate();
		Q.evaluate();
		Q2.evaluate();
		
		//This is to display the output
		System.out.print("EN: " + EN.getOutput().getTerminalValue());
		System.out.println(" D: " + D.getOutput().getTerminalValue());

/*		System.out.print("AND1: " + AND1.getInput1().getTerminalValue());
		System.out.print("+" + AND1.getInput2().getTerminalValue());
		System.out.println(":" + AND1.getOutput().getTerminalValue());

		System.out.print("AND2: " + AND2.getInput1().getTerminalValue());
		System.out.print("+" + AND2.getInput2().getTerminalValue());
		System.out.println(":" + AND2.getOutput().getTerminalValue());

		System.out.print("NOR1: " + NOR1.getInput1().getTerminalValue());
		System.out.print("+" + NOR1.getInput2().getTerminalValue());
		System.out.println(":" + NOR1.getOutput().getTerminalValue());

		System.out.print("NOR2: " + NOR2.getInput1().getTerminalValue());
		System.out.print("+" + NOR2.getInput2().getTerminalValue());
		System.out.println(":" + NOR2.getOutput().getTerminalValue());
*/
		System.out.println("Q: " + Q.getState());
		System.out.println("Q2: " + Q2.getState());
		System.out.println("");
	}

/*
	//These are the components of the circuit
	private static AND AND1 = new AND();
	private static AND AND2 = new AND();
	private static OR OR1 = new OR();
	private static LED LED1 = new LED();

	//These are the wires that connect the components together
	private static Wire wire1 = new Wire();
	private static Wire wire2 = new Wire();
	private static Wire wire3 = new Wire();
	
	public static void main(String[] args) {

		//This is how we connect the wires to the components
		wire1.connect(AND1.getOutput(), OR1.getInput1());
		wire2.connect(AND2.getOutput(), OR1.getInput2());
		wire3.connect(OR1.getOutput(), LED1.getInput());

		//This is how we set the initial values of the inputs of the AND gates
		AND1.setInput1Value(1);
		AND1.setInput2Value(1);
		
		AND2.setInput1Value(1);
		AND2.setInput2Value(1);
		
		// This is to run through the circuit and print the outcome
		run();

		//Change one input value and run it again
		AND1.setInput1Value(0);
		run();

		//Change another input value and run it again
		AND1.setInput2Value(0);
		run();

		//Change yet another input value and run it again
		AND2.setInput1Value(0);
		run();
	}

	static void run() {
		//This is how we evaluate the conditions of the parts - the order is important
		AND1.evaluate();
		AND2.evaluate();
		wire1.evaluate();
		wire2.evaluate();
		OR1.evaluate();
		wire3.evaluate();
		LED1.evaluate();
	
		//This is to display the output
		System.out.print("AND1: " + AND1.getInput1().getTerminalValue());
		System.out.print("+" + AND1.getInput2().getTerminalValue());
		System.out.println(":" + AND1.getOutput().getTerminalValue());

		System.out.print("AND2: " + AND2.getInput1().getTerminalValue());
		System.out.print("+" + AND2.getInput2().getTerminalValue());
		System.out.println(":" + AND2.getOutput().getTerminalValue());

		System.out.print("OR1: " + OR1.getInput1().getTerminalValue());
		System.out.print("+" + OR1.getInput2().getTerminalValue());
		System.out.println(":" + OR1.getOutput().getTerminalValue());

		System.out.println("LED1: " + LED1.getState());
		System.out.println("");
	}

*/
	
}
