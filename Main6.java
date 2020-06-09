package logic;

public class Main6 {

	// This is the configuration for an S-R Flip Flop

	//These are the components of the circuit
	private static AND AND1 = new AND();
	private static AND AND2 = new AND();
	private static NOR NOR1 = new NOR();
	private static NOR NOR2 = new NOR();
	private static Node R = new Node();
	private static Node S = new Node();
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
	
	public static void main(String[] args) {

		//This is how we connect the wires to the components
		wire1.connect(R.getOutput(), AND1.getInput1());
		wire2.connect(S.getOutput(), AND2.getInput2());
		wire3.connect(CLK.getOutput(), AND1.getInput2());
		wire4.connect(CLK.getOutput(), AND2.getInput1());
		wire5.connect(AND1.getOutput(), NOR1.getInput1());
		wire6.connect(AND2.getOutput(), NOR2.getInput2());
		wire7.connect(NOR1.getOutput(), NOR2.getInput1());
		wire8.connect(NOR2.getOutput(), NOR1.getInput2());
		wire9.connect(NOR1.getOutput(), Q.getInput());
		wire10.connect(NOR2.getOutput(), Q2.getInput());
		
		//This is how we set the initial values of the inputs
		System.out.println("Q should start out as ON by default?");
		R.setOutputValue(0);
		S.setOutputValue(0);
		CLK.setOutputValue(0);
		run();

		System.out.println("Q should be whatever it was");
		R.setOutputValue(1);
		run();

		System.out.println("Q should be OFF");
		CLK.setOutputValue(1);
		run();
		CLK.setOutputValue(0);
		run();
		
		System.out.println("Q should be whatever it was");
		R.setOutputValue(0);
		run();

		System.out.println("Q should be whatever it was");
		S.setOutputValue(1);
		run();

		System.out.println("Q should turn ON");
		CLK.setOutputValue(1);
		run();
		CLK.setOutputValue(0);
		run();
		
		System.out.println("Q should be whatever it was");
		S.setOutputValue(0);
		run();

		System.out.println("Q should be whatever it was");
		R.setOutputValue(1);
		S.setOutputValue(1);
		run();

		System.out.println("Q and Q2 should BOTH be OFF!!! - Now that's interesting!");
		CLK.setOutputValue(1);
		run();
		System.out.println("Don't know if Q should be ON or OFF??!");
		CLK.setOutputValue(0);
		run();
		
		System.out.println("Q should be whatever it was");
		R.setOutputValue(0);
		S.setOutputValue(0);
		run();
		
	}

	static void run() {
		//This is how we evaluate the conditions of the parts - the order is important
		wire1.energize();
		wire2.energize();
		wire3.energize();
		wire4.energize();
		AND1.energize();
		AND2.energize();
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
		System.out.print("R: " + R.getOutput().getTerminalValue());
		System.out.print(" S: " + S.getOutput().getTerminalValue());
		System.out.println(" CLK: " + CLK.getOutput().getTerminalValue());

		System.out.print("AND1: " + AND1.getInput1().getTerminalValue());
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

		System.out.println("Q: " + Q.getState());
		System.out.println("Q2: " + Q2.getState());
		System.out.println("");
	}
}
