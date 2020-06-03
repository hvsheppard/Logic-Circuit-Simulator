package Logic;

public class Main4 {

	// This is the configuration for a J-K Flip Flop
	
	//These are the components of the circuit
	private static AND3 AND31 = new AND3();
	private static AND3 AND32 = new AND3();
	private static NOR NOR1 = new NOR();
	private static NOR NOR2 = new NOR();
	private static Node J = new Node();
	private static Node K = new Node();
	private static Node CLK = new Node();
	private static LED Q = new LED();
	private static LED Q2 = new LED();

	//These are the wires that connect the components together
	private static Wire wire1 = new Wire();
	private static Wire wire2 = new Wire();
	private static Wire wire3 = new Wire();
	private static Wire wire4 = new Wire();
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
		wire1.connect(K.getOutput(), AND31.getInput2());
		wire2.connect(J.getOutput(), AND32.getInput2());
		wire3.connect(CLK.getOutput(), AND31.getInput3());
		wire4.connect(CLK.getOutput(), AND32.getInput1());
		wire5.connect(AND31.getOutput(), NOR1.getInput1());
		wire6.connect(AND32.getOutput(), NOR2.getInput2());
		wire7.connect(NOR1.getOutput(), NOR2.getInput1());
		wire8.connect(NOR2.getOutput(), NOR1.getInput2());
		wire9.connect(NOR1.getOutput(), Q.getInput());
		wire10.connect(NOR2.getOutput(), Q2.getInput());
		wire11.connect(NOR1.getOutput(), AND31.getInput1());
		wire12.connect(NOR2.getOutput(), AND32.getInput3());
		
		//This is how we set the initial values of the inputs
		// First, both the Data and Enable inputs are LOW
		K.setOutputValue(0);
		J.setOutputValue(0);
		CLK.setOutputValue(0);
		
		// This is to run through the circuit and print the outcome
		run();

		// This shows that while the CLK is HIGH, the output will toggle
		// rapidly ON and OFF as long as the CLK stays HIGH, and will 
		// only settle into one state or the other when the CLK goes LOW
		K.setOutputValue(1);
		J.setOutputValue(1);
		CLK.setOutputValue(1);
		run();
		run();
		run();

	}

	static void run() {
		//This is how we evaluate the conditions of the parts - the order is important
		wire11.energize();
		wire12.energize();
		wire1.energize();
		wire2.energize();
		wire3.energize();
		wire4.energize();
		AND31.energize();
		AND32.energize();
		wire5.energize();
		wire6.energize();
		NOR1.energize();
		wire7.energize();
		NOR2.energize();
		wire8.energize();
		NOR1.energize();
		wire7.energize();
		NOR2.energize();
		wire8.energize();
		wire9.energize();
		wire10.energize();
		Q.energize();
		Q2.energize();

		//This is to display the output
		System.out.print("K: " + K.getOutput().getTerminalValue());
		System.out.print(" J: " + J.getOutput().getTerminalValue());
		System.out.println(" CLK: " + CLK.getOutput().getTerminalValue());

		System.out.print("AND31: " + AND31.getInput1().getTerminalValue());
		System.out.print("+" + AND31.getInput2().getTerminalValue());
		System.out.print("+" + AND31.getInput3().getTerminalValue());
		System.out.println(":" + AND31.getOutput().getTerminalValue());

		System.out.print("AND32: " + AND32.getInput1().getTerminalValue());
		System.out.print("+" + AND32.getInput2().getTerminalValue());
		System.out.print("+" + AND32.getInput3().getTerminalValue());
		System.out.println(":" + AND32.getOutput().getTerminalValue());

		System.out.print("NOR1: " + NOR1.getInput1().getTerminalValue());
		System.out.print("+" + NOR1.getInput2().getTerminalValue());
		System.out.println(":" + NOR1.getOutput().getTerminalValue());

		System.out.print("NOR2: " + NOR2.getInput1().getTerminalValue());
		System.out.print("+" + NOR2.getInput2().getTerminalValue());
		System.out.println(":" + NOR2.getOutput().getTerminalValue());

		System.out.println("Q: " + Q.getState());
		System.out.println("Q2: " + Q2.getState());
		System.out.println("");
	}
}
