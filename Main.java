package logic;

public class Main {
/*
        CIRCUIT DIAGRAM

       ____    
   1---|    \
       |AND1 |----1	
   1---|____/    |       ____           ____
                  -----1|    \         /    \
                        | OR1 >1------| LED1 |
        ____      -----1|____/         \____/
   1---|    \    |
       |AND2 |----1
   1---|____/
	 
*/	
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
		AND1.energize();
		AND2.energize();
		wire1.energize();
		wire2.energize();
		OR1.energize();
		wire3.energize();
		LED1.energize();
	
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

}
