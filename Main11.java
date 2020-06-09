package logic;

public class Main11 {

	// This is the configuration for an S-R Latch
	
	//These are the components of the circuit
	private static NOR NOR1 = new NOR();
	private static NOR NOR2 = new NOR();
	private static Node R = new Node();
	private static Node S = new Node();
	private static LED Q = new LED();
	private static LED Q2 = new LED();

	//These are the wires that connect the components together
	private static Wire wire1 = new Wire();
	private static Wire wire2 = new Wire();
	private static Wire wire3 = new Wire();
	private static Wire wire4 = new Wire();
	private static Wire wire5 = new Wire();
	private static Wire wire6 = new Wire();
	
	public static void main(String[] args) {

		//This is how we connect the wires to the components
		wire1.connect(R.getOutput(), NOR1.getInput1());
		wire2.connect(S.getOutput(), NOR2.getInput2());
		wire3.connect(NOR1.getOutput(), NOR2.getInput1());
		wire4.connect(NOR2.getOutput(), NOR1.getInput2());
		wire5.connect(NOR1.getOutput(), Q.getInput());
		wire6.connect(NOR2.getOutput(), Q2.getInput());
		
		//This is how we set the initial values of the inputs
		System.out.println("Q starts out as ON");
		R.setOutputValue(0);
		S.setOutputValue(0);
		run();

		System.out.println("Q should stay ON");
		S.setOutputValue(1);
		run();

		System.out.println("Q should stay ON");
		S.setOutputValue(0);
		run();

		System.out.println("Q should turn OFF");
		R.setOutputValue(1);
		run();

		System.out.println("Q should stay OFF");
		R.setOutputValue(0);
		run();

		System.out.println("Q should turn ON");
		S.setOutputValue(1);
		run();

		System.out.println("Q should stay ON");
		S.setOutputValue(0);
		run();

	}

	static void run() {
		//This is how we evaluate the conditions of the parts - the order is important
		wire1.energize();
		NOR1.energize();
		wire3.energize();
		wire2.energize();
		NOR2.energize();
		wire4.energize();
		NOR1.energize();
		wire3.energize();
		NOR2.energize();
		wire5.energize();
		wire6.energize();
		Q.energize();
		Q2.energize();
				
		//This is to display the output
		System.out.print("R: " + R.getOutput().getTerminalValue());
		System.out.println(" S: " + S.getOutput().getTerminalValue());

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
