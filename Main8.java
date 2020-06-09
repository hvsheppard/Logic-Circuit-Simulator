package logic;

public class Main8 {

	// This is the configuration for an Edge Detector

	//These are the components of the circuit
	private static AND AND1 = new AND();
	private static NOT NOT1 = new NOT();
	private static NOT NOT2 = new NOT();
	private static NOT NOT3 = new NOT();
	private static Node IN1 = new Node();
	private static LED Q = new LED();

	//These are the wires that connect the components together
	private static Wire wire1 = new Wire();
	private static Wire wire2 = new Wire();
	private static Wire wire3 = new Wire();
	private static Wire wire4 = new Wire();
	private static Wire wire5 = new Wire();
	private static Wire wire6 = new Wire();
	
	public static void main(String[] args) {

		//This is how we connect the wires to the components
		wire1.connect(IN1.getOutput(), AND1.getInput1());
		wire2.connect(IN1.getOutput(), NOT1.getInput());
		wire3.connect(NOT1.getOutput(), NOT2.getInput());
		wire4.connect(NOT2.getOutput(), NOT3.getInput());
		wire5.connect(NOT3.getOutput(), AND1.getInput2());
		wire6.connect(AND1.getOutput(), Q.getInput());

		//This is how we set the initial values of the inputs
		System.out.println("Q should start out as OFF by default");
		IN1.setOutputValue(0);
		runA();
		runB();

		//This is how we set the initial values of the inputs
		System.out.println("Q should go ON very briefly, and then immediately go OFF");
		IN1.setOutputValue(1);
		runA();
		runB();

		//This is how we set the initial values of the inputs
		System.out.println("Q should stay OFF");
		IN1.setOutputValue(0);
		runA();
		runB();

	}

	static void runA() {
		//This is how we evaluate the conditions of the parts - the order is important
		wire1.energize();
		wire2.energize();
		NOT1.energize();
		wire3.energize();
		NOT2.energize();
		wire4.energize();
		AND1.energize();
		wire6.energize();
		Q.energize();
	
		//This is to display the output
		System.out.println("Part A");
		System.out.println("IN1: " + IN1.getOutput().getTerminalValue());

		System.out.print("NOT1: " + NOT1.getInput().getTerminalValue());
		System.out.println(":" + NOT1.getOutput().getTerminalValue());

		System.out.print("NOT2: " + NOT2.getInput().getTerminalValue());
		System.out.println(":" + NOT2.getOutput().getTerminalValue());

		System.out.print("NOT3: " + NOT3.getInput().getTerminalValue());
		System.out.println(":" + NOT3.getOutput().getTerminalValue());

		System.out.print("AND1: " + AND1.getInput1().getTerminalValue());
		System.out.print("+" + AND1.getInput2().getTerminalValue());
		System.out.println(":" + AND1.getOutput().getTerminalValue());

		System.out.println("Q: " + Q.getState());
		System.out.println("");
	}

	static void runB() {
		// part 2 of the run - to simulate the delay in the 3 NOT gates propagating the signal
		NOT3.energize();
		wire5.energize();
		AND1.energize();
		wire6.energize();
		Q.energize();
	
		//This is to display the output
		System.out.println("Part B");
		System.out.println("IN1: " + IN1.getOutput().getTerminalValue());

		System.out.print("NOT1: " + NOT1.getInput().getTerminalValue());
		System.out.println(":" + NOT1.getOutput().getTerminalValue());

		System.out.print("NOT2: " + NOT2.getInput().getTerminalValue());
		System.out.println(":" + NOT2.getOutput().getTerminalValue());

		System.out.print("NOT3: " + NOT3.getInput().getTerminalValue());
		System.out.println(":" + NOT3.getOutput().getTerminalValue());

		System.out.print("AND1: " + AND1.getInput1().getTerminalValue());
		System.out.print("+" + AND1.getInput2().getTerminalValue());
		System.out.println(":" + AND1.getOutput().getTerminalValue());

		System.out.println("Q: " + Q.getState());
		System.out.println("");
	}
}


/*
           _   _         _    _    _    _    _    _    _                   _    _ 
       |   _|  _|  |_|  |_   |_     |  |_|  |_|  | |  |_|  |_    _    _|  |_   |_ 
       |  |_   _|    |   _|  |_|    |  |_|   _|  |_|  | |  |_|  |_   |_|  |_   |  
       
*/

