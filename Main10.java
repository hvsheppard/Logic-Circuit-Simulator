package logic;

public class Main10 {

	// This is the configuration for a 'D' Latch
	
	//These are the components of the circuit
	private static OR OR1 = new OR();
	private static Node A = new Node();
	private static LED Q = new LED();

	//These are the wires that connect the components together
	private static Wire wire1 = new Wire();
	private static Wire wire2 = new Wire();
	private static Wire wire3 = new Wire();
	
	public static void main(String[] args) {

		//This is how we connect the wires to the components
		wire1.connect(A.getOutput(), OR1.getInput1());
		wire2.connect(OR1.getOutput(), OR1.getInput2());
		wire3.connect(OR1.getOutput(), Q.getInput());

		//This is how we set the initial values of the input
		System.out.println("Q should start out as OFF");
		A.setOutputValue(0);
		run();

		System.out.println("Q should turn ON");
		//This is how we set the initial values of the input
		A.setOutputValue(1);
		run();

		System.out.println("Q should stay on, even though A went LOW");
		//This is how we set the initial values of the input
		A.setOutputValue(0);
		run();

	}

	static void run() {
		//This is how we evaluate the conditions of the parts - the order is important
		wire1.energize();
		OR1.energize();
		wire2.energize();
		OR1.energize();
		wire3.energize();
		Q.energize();
		
		//This is to display the output
		System.out.println("A: " + A.getOutput().getTerminalValue());

		System.out.print("OR1: " + OR1.getInput1().getTerminalValue());
		System.out.print("+" + OR1.getInput2().getTerminalValue());
		System.out.println(":" + OR1.getOutput().getTerminalValue());

		System.out.println("Q: " + Q.getState());
		System.out.println("");
	}
}
