package logic;

public class Main13 {

	// This is the configuration for a J-K Flip Flop (Design #2 - All NANDs) 
	// (Can observe "racing"!)
	
	//These are the components of the circuit
	private static NAND3 NAND31 = new NAND3();
	private static NAND3 NAND32 = new NAND3();
	private static NAND NAND1 = new NAND();
	private static NAND NAND2 = new NAND();
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
		wire1.connect(J.getOutput(), NAND31.getInput2());
		wire2.connect(K.getOutput(), NAND32.getInput2());
		wire3.connect(CLK.getOutput(), NAND31.getInput3());
		wire4.connect(CLK.getOutput(), NAND32.getInput1());
		wire5.connect(NAND31.getOutput(), NAND1.getInput1());
		wire6.connect(NAND32.getOutput(), NAND2.getInput2());
		wire7.connect(NAND1.getOutput(), NAND2.getInput1());
		wire8.connect(NAND2.getOutput(), NAND1.getInput2());
		wire9.connect(NAND2.getOutput(), NAND31.getInput1());
		wire10.connect(NAND1.getOutput(), NAND32.getInput3());
		wire11.connect(NAND1.getOutput(), Q.getInput());
		wire12.connect(NAND2.getOutput(), Q2.getInput());
		
		//This is how we set the initial values of the inputs
		System.out.println("Q starts out as ON");
		J.setOutputValue(0);
		K.setOutputValue(0);
		CLK.setOutputValue(0);
		run();

		System.out.println("Q should stay ON");
		CLK.setOutputValue(1);
		run();

		System.out.println("No change");
		CLK.setOutputValue(0);
		run();

		System.out.println("No change");
		K.setOutputValue(1);
		run();

		System.out.println("Q should turn OFF");
		CLK.setOutputValue(1);
		run();

		System.out.println("No change");
		CLK.setOutputValue(0);
		run();

		System.out.println("No change");
		K.setOutputValue(0);
		run();

		System.out.println("No change");
		J.setOutputValue(1);
		run();

		System.out.println("Q should turn ON");
		CLK.setOutputValue(1);
		run();

		System.out.println("No change");
		CLK.setOutputValue(0);
		run();

		System.out.println("No change");
		J.setOutputValue(0);
		run();

		System.out.println("No change");
		J.setOutputValue(1);
		K.setOutputValue(1);
		run();

		System.out.println("Q should turn OFF");
		CLK.setOutputValue(1);
		run();

		System.out.println("RACING: Q should turn ON again, while CLK is still HIGH");
		run();

		System.out.println("RACING: Q should turn OFF again, while CLK is still HIGH");
		run();

		System.out.println("RACING: Q should turn ON again, while CLK is still HIGH");
		run();

		System.out.println("Q stays in whatever state it ended up in last");
		CLK.setOutputValue(0);
		run();

	}

	static void run() {
		//This is how we evaluate the conditions of the parts - the order is important
		wire1.energize();
		wire2.energize();
		wire3.energize();
		wire4.energize();
		NAND31.energize();
		NAND32.energize();
		wire5.energize();
		wire6.energize();
		NAND1.energize();
		wire7.energize();
		NAND2.energize();
		wire8.energize();
		NAND1.energize();
		wire7.energize();
		NAND2.energize();
		wire9.energize();
		wire10.energize();
		wire11.energize();
		wire12.energize();
		Q.energize();
		Q2.energize();
		
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

		System.out.println("Q: " + Q.getState());
		System.out.println("Q2: " + Q2.getState());

		System.out.println("");
	}
}
