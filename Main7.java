package logic;

public class Main7 {

	// This is the configuration for a D Latch (alternate circuit from 74LS75)

	//These are the components of the circuit
	private static AND AND1 = new AND();
	private static AND AND2 = new AND();
	private static NOR NOR1 = new NOR();
	private static NOT NOT1 = new NOT();
	private static NOT NOT2 = new NOT();
	private static Node DATA = new Node();
	private static Node ENABLE = new Node();
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
	
	public static void main(String[] args) {

		//This is how we connect the wires to the components
		wire1.connect(DATA.getOutput(), AND1.getInput1());
		wire2.connect(ENABLE.getOutput(), AND1.getInput2());
		wire3.connect(ENABLE.getOutput(), NOT1.getInput());
		wire4.connect(NOT1.getOutput(), AND2.getInput1());
		wire5.connect(AND1.getOutput(), NOR1.getInput1());
		wire6.connect(AND2.getOutput(), NOR1.getInput2());
		wire7.connect(NOR1.getOutput(), NOT2.getInput());
		wire8.connect(NOR1.getOutput(), Q2.getInput());
		wire9.connect(NOT2.getOutput(), Q.getInput());
		wire10.connect(NOT2.getOutput(), AND2.getInput2());
		
		//This is how we set the initial values of the inputs
		System.out.println("Q should start out as OFF by default");
		DATA.setOutputValue(0);
		ENABLE.setOutputValue(0);
		run();

		System.out.println("Q should stay OFF");
		DATA.setOutputValue(1);
		run();

		System.out.println("Q should stay OFF");
		DATA.setOutputValue(0);
		run();

		System.out.println("Q should stay OFF");
		DATA.setOutputValue(1);
		run();

		System.out.println("Q should turn ON");
		ENABLE.setOutputValue(1);
		run();

		System.out.println("Q should turn OFF");
		DATA.setOutputValue(0);
		run();

		System.out.println("Q should turn ON");
		DATA.setOutputValue(1);
		run();

		System.out.println("Q should stay ON");
		ENABLE.setOutputValue(0);
		run();

		System.out.println("Q should stay ON");
		DATA.setOutputValue(0);
		run();
		
	}

	static void run() {
		//This is how we evaluate the conditions of the parts - the order is important
		wire1.energize();
		wire2.energize();
		wire3.energize();
		NOT1.energize();
		wire4.energize();
		AND1.energize();
		AND2.energize();
		wire5.energize();
		wire6.energize();
		NOR1.energize();
		wire7.energize();
		wire8.energize();
		NOT2.energize();
		wire9.energize();
		wire10.energize();
		Q.energize();
		Q2.energize();
		
		//This is to display the output
		System.out.print("DATA: " + DATA.getOutput().getTerminalValue());
		System.out.println(" ENABLE: " + ENABLE.getOutput().getTerminalValue());

		System.out.print("NOT1: " + NOT1.getInput().getTerminalValue());
		System.out.println(":" + NOT1.getOutput().getTerminalValue());

		System.out.print("AND1: " + AND1.getInput1().getTerminalValue());
		System.out.print("+" + AND1.getInput2().getTerminalValue());
		System.out.println(":" + AND1.getOutput().getTerminalValue());

		System.out.print("AND2: " + AND2.getInput1().getTerminalValue());
		System.out.print("+" + AND2.getInput2().getTerminalValue());
		System.out.println(":" + AND2.getOutput().getTerminalValue());

		System.out.print("NOR1: " + NOR1.getInput1().getTerminalValue());
		System.out.print("+" + NOR1.getInput2().getTerminalValue());
		System.out.println(":" + NOR1.getOutput().getTerminalValue());

		System.out.print("NOT2: " + NOT2.getInput().getTerminalValue());
		System.out.println(":" + NOT2.getOutput().getTerminalValue());

		System.out.println("Q: " + Q.getState());
		System.out.println("Q2: " + Q2.getState());
		System.out.println("");
	}
}
