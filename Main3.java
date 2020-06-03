package Logic;

public class Main3 {

	// This is the alternate configuration for a Master-Slave J-K Flip Flop, using all NAND gates
	
	//These are the components of the circuit
	private static NAND NAND1 = new NAND();
	private static NAND NAND2 = new NAND();
	private static NAND NAND3 = new NAND();
	private static NAND NAND4 = new NAND();
	private static NAND NAND5 = new NAND();
	private static NAND NAND6 = new NAND();
	private static NAND3 NAND31 = new NAND3();
	private static NAND3 NAND32 = new NAND3();
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
		wire1.connect(J.getOutput(), NAND31.getInput2());
		wire2.connect(K.getOutput(), NAND32.getInput2());
		wire3.connect(CLK.getOutput(), NAND31.getInput3());
		wire4.connect(CLK.getOutput(), NAND32.getInput1());
		wire5.connect(CLK.getOutput(), NOT1.getInput());
		wire6.connect(NAND31.getOutput(), NAND1.getInput1());
		wire7.connect(NAND32.getOutput(), NAND2.getInput2());
		wire8.connect(NAND1.getOutput(), NAND2.getInput1());
		wire9.connect(NAND2.getOutput(), NAND1.getInput2());
		wire10.connect(NAND1.getOutput(), NAND3.getInput1());
		wire11.connect(NAND2.getOutput(), NAND4.getInput2());
		wire12.connect(NOT1.getOutput(), NAND3.getInput2());
		wire13.connect(NOT1.getOutput(), NAND4.getInput1());
		wire14.connect(NAND3.getOutput(), NAND5.getInput1());
		wire15.connect(NAND5.getOutput(), NAND6.getInput1());
		wire16.connect(NAND4.getOutput(), NAND6.getInput2());
		wire17.connect(NAND6.getOutput(), NAND5.getInput2());
		wire18.connect(NAND5.getOutput(), Q.getInput());
		wire19.connect(NAND6.getOutput(), Q2.getInput());
		wire20.connect(NAND6.getOutput(), NAND31.getInput1());
		wire21.connect(NAND5.getOutput(), NAND32.getInput3());
		
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
		wire20.evaluate();
		wire21.evaluate();
		wire1.evaluate();
		wire3.evaluate();
		wire2.evaluate();
		wire4.evaluate();
		NAND31.evaluate();
		wire6.evaluate();
		NAND32.evaluate();
		wire7.evaluate();
		NAND1.evaluate();
		wire8.evaluate();
		NAND2.evaluate();
		wire9.evaluate();
		NAND1.evaluate();
		wire8.evaluate();
		NAND2.evaluate();
		wire9.evaluate();
		wire10.evaluate();
		wire11.evaluate();
		wire5.evaluate();
		NOT1.evaluate();
		wire12.evaluate();
		wire13.evaluate();
		NAND3.evaluate();
		NAND4.evaluate();
		wire14.evaluate();
		wire16.evaluate();
		NAND5.evaluate();
		wire15.evaluate();
		NAND6.evaluate();
		wire17.evaluate();
		NAND5.evaluate();
		wire15.evaluate();
		NAND6.evaluate();
		wire17.evaluate();
		wire18.evaluate();
		wire19.evaluate();
		Q.evaluate();
		Q2.evaluate();

		//This is to display the output
		System.out.print("J: " + J.getOutput().getTerminalValue());
		System.out.print(" K: " + K.getOutput().getTerminalValue());
		System.out.println(" CLK: " + CLK.getOutput().getTerminalValue());

		System.out.print("NAND31: " + NAND31.getInput1().getTerminalValue());
		System.out.print("+" + NAND31.getInput2().getTerminalValue());
		System.out.print("+" + NAND31.getInput3().getTerminalValue());
		System.out.println(":" + NAND31.getOutput().getTerminalValue());

		System.out.print("NAND32: " + NAND32.getInput1().getTerminalValue());
		System.out.print("+" + NAND32.getInput2().getTerminalValue());
		System.out.print("+" + NAND32.getInput3().getTerminalValue());
		System.out.println(":" + NAND32.getOutput().getTerminalValue());

		System.out.print("NAND1: " + NAND1.getInput1().getTerminalValue());
		System.out.print("+" + NAND1.getInput2().getTerminalValue());
		System.out.println(":" + NAND1.getOutput().getTerminalValue());

		System.out.print("NAND2: " + NAND2.getInput1().getTerminalValue());
		System.out.print("+" + NAND2.getInput2().getTerminalValue());
		System.out.println(":" + NAND2.getOutput().getTerminalValue());

		System.out.print("NOT1: " + NOT1.getInput().getTerminalValue());
		System.out.println("+" + NOT1.getOutput().getTerminalValue());

		System.out.print("NAND3: " + NAND3.getInput1().getTerminalValue());
		System.out.print("+" + NAND3.getInput2().getTerminalValue());
		System.out.println(":" + NAND3.getOutput().getTerminalValue());

		System.out.print("NAND4: " + NAND4.getInput1().getTerminalValue());
		System.out.print("+" + NAND4.getInput2().getTerminalValue());
		System.out.println(":" + NAND4.getOutput().getTerminalValue());

		System.out.print("NAND5: " + NAND5.getInput1().getTerminalValue());
		System.out.print("+" + NAND5.getInput2().getTerminalValue());
		System.out.println(":" + NAND5.getOutput().getTerminalValue());

		System.out.print("NAND6: " + NAND6.getInput1().getTerminalValue());
		System.out.print("+" + NAND6.getInput2().getTerminalValue());
		System.out.println(":" + NAND6.getOutput().getTerminalValue());

		System.out.println("Q: " + Q.getState());
		System.out.println("Q2: " + Q2.getState());
		System.out.println("");
	}
}
