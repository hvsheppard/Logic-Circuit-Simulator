package logic;

public class Main2 {

	// This is the configuration for a Master-Slave J-K Flip Flop
	
	//These are the components of the circuit
	private static AND AND1 = new AND();
	private static AND AND2 = new AND();
	private static AND3 AND31 = new AND3();
	private static AND3 AND32 = new AND3();
	private static NOR NOR1 = new NOR();
	private static NOR NOR2 = new NOR();
	private static NOR NOR3 = new NOR();
	private static NOR NOR4 = new NOR();
	private static NOT NOT1 = new NOT();
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
	private static Wire wire13 = new Wire();
	private static Wire wire14 = new Wire();
	private static Wire wire15 = new Wire();
	private static Wire wire16 = new Wire();
	private static Wire wire17 = new Wire();
	private static Wire wire18 = new Wire();
	private static Wire wire19 = new Wire();
	private static Wire wire20 = new Wire();
	private static Wire wire21 = new Wire();
	
	public static void main(String[] args) {

		//This is how we connect the wires to the components
		wire1.connect(J.getOutput(), AND31.getInput2());
		wire2.connect(K.getOutput(), AND32.getInput2());
		wire3.connect(CLK.getOutput(), AND31.getInput3());
		wire4.connect(CLK.getOutput(), AND32.getInput1());
		wire5.connect(CLK.getOutput(), NOT1.getInput());
		wire6.connect(AND31.getOutput(), NOR1.getInput1());
		wire7.connect(AND32.getOutput(), NOR2.getInput2());
		wire8.connect(NOR1.getOutput(), AND1.getInput1());
		wire9.connect(NOR1.getOutput(), NOR2.getInput1());
		wire10.connect(NOR2.getOutput(), NOR1.getInput2());
		wire11.connect(NOR2.getOutput(), AND2.getInput2());
		wire12.connect(NOT1.getOutput(), AND1.getInput2());
		wire13.connect(NOT1.getOutput(), AND2.getInput1());
		wire14.connect(AND1.getOutput(), NOR3.getInput1());
		wire15.connect(NOR4.getOutput(), NOR3.getInput2());
		wire16.connect(NOR3.getOutput(), Q.getInput());
		wire17.connect(NOR3.getOutput(), NOR4.getInput1());
		wire18.connect(AND2.getOutput(), NOR4.getInput2());
		wire19.connect(NOR4.getOutput(), Q2.getInput());
		wire20.connect(NOR4.getOutput(), AND31.getInput1());
		wire21.connect(NOR3.getOutput(), AND32.getInput3());
		
		//This is how we set the initial values of the inputs
		// First, both the Data and Enable inputs are LOW
		J.setOutputValue(1);
		K.setOutputValue(1);
		CLK.setOutputValue(0);
		
		// This is to run through the circuit and print the outcome
		System.out.println("Clock OFF");
		run();

		CLK.setOutputValue(1);
		System.out.println("Clock ON");
		run();

		CLK.setOutputValue(0);
		System.out.println("Clock OFF");
		run();

		CLK.setOutputValue(1);
		System.out.println("Clock ON");
		run();

		CLK.setOutputValue(0);
		System.out.println("Clock OFF");
		run();

	}

	static void run() {
		//This is how we evaluate the conditions of the parts - the order is important
		wire20.energize();
		wire21.energize();
		wire1.energize();
		wire3.energize();
		wire2.energize();
		wire4.energize();
		AND31.energize();
		wire6.energize();
		NOR1.energize();
		wire9.energize();
		AND32.energize();
		wire7.energize();
		NOR2.energize();
		wire10.energize();
		NOR1.energize();
		wire9.energize();
		NOR2.energize();
		wire8.energize();
		wire11.energize();
		wire5.energize();
		NOT1.energize();
		wire12.energize();
		wire13.energize();
		AND1.energize();
		AND2.energize();
		wire14.energize();
		NOR3.energize();
		wire17.energize();
		wire18.energize();
		NOR4.energize();
		wire15.energize();
		NOR3.energize();
		wire17.energize();
		NOR4.energize();
		wire16.energize();
		wire19.energize();
		Q.energize();
		Q2.energize();

		//This is to display the output
		System.out.print("J: " + J.getOutput().getTerminalValue());
		System.out.print(" K: " + K.getOutput().getTerminalValue());
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

		System.out.print("AND1: " + AND1.getInput1().getTerminalValue());
		System.out.print("+" + AND1.getInput2().getTerminalValue());
		System.out.println(":" + AND1.getOutput().getTerminalValue());

		System.out.print("AND2: " + AND2.getInput1().getTerminalValue());
		System.out.print("+" + AND2.getInput2().getTerminalValue());
		System.out.println(":" + AND2.getOutput().getTerminalValue());

		System.out.print("NOR3: " + NOR3.getInput1().getTerminalValue());
		System.out.print("+" + NOR3.getInput2().getTerminalValue());
		System.out.println(":" + NOR3.getOutput().getTerminalValue());

		System.out.print("NOR4: " + NOR4.getInput1().getTerminalValue());
		System.out.print("+" + NOR4.getInput2().getTerminalValue());
		System.out.println(":" + NOR4.getOutput().getTerminalValue());

		System.out.println("Q: " + Q.getState());
		System.out.println("Q2: " + Q2.getState());
		System.out.println("");
	}
}
