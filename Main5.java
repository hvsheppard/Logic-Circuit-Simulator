package logic;

public class Main5 {

	// This is the configuration for a 1-bit Register using a D Flip Flop

/*
  
  TIMING DIAGRAM (numbers are the run #'s - ...8, 9, 0=10, 1=11, etc.)
  
          0                 7____0    2__4    6____________2
    LOAD  __________________|    |____|  |____|            |___

          0           3___6   8___1         5______9
    D     ____________|   |___|   |_________|      |___________   

          0H   1_2     4_5     9_0     3L4     7H8     0L1
    CLK   _____| |_____| |_____| |_____| |_____| |_____| |_____    
	
*/
	
	//These are the components of the circuit
	private static AND AND1 = new AND();
	private static AND AND2 = new AND();
	private static AND AND3 = new AND();
	private static AND AND4 = new AND();
	private static OR OR1 = new OR();
	private static NOR NOR1 = new NOR();
	private static NOR NOR2 = new NOR();
	private static NOT NOT1 = new NOT();
	private static NOT NOT2 = new NOT();
	private static Node LOAD = new Node();
	private static Node D = new Node();
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
	
	public static void main(String[] args) {

		//This is how we connect the wires to the components
		wire17.connect(NOR1.getOutput(), AND1.getInput1());
		wire1.connect(LOAD.getOutput(), NOT1.getInput());
		wire2.connect(LOAD.getOutput(), AND2.getInput1());
		wire3.connect(D.getOutput(), AND2.getInput2());
		wire4.connect(NOT1.getOutput(), AND1.getInput2());
		wire5.connect(AND1.getOutput(), OR1.getInput1());
		wire6.connect(AND2.getOutput(), OR1.getInput2());
		wire7.connect(OR1.getOutput(), NOT2.getInput());
		wire8.connect(OR1.getOutput(), AND4.getInput2());
		wire9.connect(CLK.getOutput(), AND3.getInput2());
		wire10.connect(CLK.getOutput(), AND4.getInput1());
		wire11.connect(AND3.getOutput(), NOR1.getInput1());
		wire12.connect(AND4.getOutput(), NOR2.getInput2());
		wire13.connect(NOR2.getOutput(), NOR1.getInput2());
		wire14.connect(NOR1.getOutput(), NOR2.getInput1());
		wire15.connect(NOR1.getOutput(), Q.getInput());
		wire16.connect(NOR2.getOutput(), Q2.getInput());
		wire18.connect(NOT2.getOutput(), AND3.getInput1());
		
		//This is how we set the initial values of the inputs
		// First, the LOAD, D and CLK inputs are all LOW
		System.out.println("#0 - Q should start out as ON by default");
		LOAD.setOutputValue(0);
		D.setOutputValue(0);
		CLK.setOutputValue(0);
		run();

		System.out.println("#1");
		CLK.setOutputValue(1);
		run();
		System.out.println("#2");
		CLK.setOutputValue(0);
		run();
		
		System.out.println("#3");
		D.setOutputValue(1);
		run();

		System.out.println("#4");
		CLK.setOutputValue(1);
		run();
		System.out.println("#5");
		CLK.setOutputValue(0);
		run();
		
		System.out.println("#6");
		D.setOutputValue(0);
		run();

		System.out.println("#7");
		LOAD.setOutputValue(1);
		run();

		System.out.println("#8");
		D.setOutputValue(1);
		run();

		System.out.println("#9 - Q should stay ON");
		CLK.setOutputValue(1);
		run();
		System.out.println("#10");
		CLK.setOutputValue(0);
		LOAD.setOutputValue(0);
		run();
		
		System.out.println("#11");
		D.setOutputValue(0);
		run();

		System.out.println("#12");
		LOAD.setOutputValue(1);
		run();

		System.out.println("#13 - Q should turn OFF");
		CLK.setOutputValue(1);
		run();
		System.out.println("#14");
		CLK.setOutputValue(0);
		LOAD.setOutputValue(0);
		run();
		
		System.out.println("#15");
		D.setOutputValue(1);
		run();

		System.out.println("#16");
		LOAD.setOutputValue(1);
		run();

		System.out.println("#17 - Q should turn ON");
		CLK.setOutputValue(1);
		run();
		System.out.println("#18");
		CLK.setOutputValue(0);
		run();
		
		System.out.println("#19");
		D.setOutputValue(0);
		run();

		System.out.println("#20 - Q should turn OFF");
		CLK.setOutputValue(1);
		run();
		System.out.println("#21");
		CLK.setOutputValue(0);
		run();
		
		System.out.println("#22");
		LOAD.setOutputValue(0);
		run();

	}

	static void run() {
		//This is how we evaluate the conditions of the parts - the order is important
		wire17.energize();
		wire1.energize();
		wire2.energize();
		wire3.energize();
		NOT1.energize();
		wire4.energize();
		AND1.energize();
		AND2.energize();
		wire5.energize();
		wire6.energize();
		OR1.energize();
		wire7.energize();
		wire8.energize();
		NOT2.energize();
		wire18.energize();
		wire9.energize();
		wire10.energize();
		AND3.energize();
		AND4.energize();
		wire11.energize();
		wire12.energize();
		NOR1.energize();
		wire14.energize();
		NOR2.energize();
		wire13.energize();
		NOR1.energize();
		wire14.energize();
		NOR2.energize();
		wire15.energize();
		wire16.energize();
		Q.energize();
		Q2.energize();
		
		//This is to display the output
		System.out.print("LOAD: " + LOAD.getOutput().getTerminalValue());
		System.out.print(" D: " + D.getOutput().getTerminalValue());
		System.out.println(" CLK: " + CLK.getOutput().getTerminalValue());

		System.out.print("NOT1: " + NOT1.getInput().getTerminalValue());
		System.out.println(":" + NOT1.getOutput().getTerminalValue());

		System.out.print("AND1: " + AND1.getInput1().getTerminalValue());
		System.out.print("+" + AND1.getInput2().getTerminalValue());
		System.out.println(":" + AND1.getOutput().getTerminalValue());

		System.out.print("AND2: " + AND2.getInput1().getTerminalValue());
		System.out.print("+" + AND2.getInput2().getTerminalValue());
		System.out.println(":" + AND2.getOutput().getTerminalValue());

		System.out.print("OR1: " + OR1.getInput1().getTerminalValue());
		System.out.print("+" + OR1.getInput2().getTerminalValue());
		System.out.println(":" + OR1.getOutput().getTerminalValue());

		System.out.print("NOT2: " + NOT2.getInput().getTerminalValue());
		System.out.println(":" + NOT2.getOutput().getTerminalValue());

		System.out.print("AND3: " + AND3.getInput1().getTerminalValue());
		System.out.print("+" + AND3.getInput2().getTerminalValue());
		System.out.println(":" + AND3.getOutput().getTerminalValue());

		System.out.print("AND4: " + AND4.getInput1().getTerminalValue());
		System.out.print("+" + AND4.getInput2().getTerminalValue());
		System.out.println(":" + AND4.getOutput().getTerminalValue());

		System.out.print("NOR1: " + NOR1.getInput1().getTerminalValue());
		System.out.print("+" + NOR1.getInput2().getTerminalValue());
		System.out.println(":" + NOR1.getOutput().getTerminalValue());

		System.out.print("NOR2: " + NOR2.getInput1().getTerminalValue());
		System.out.print("+" + NOR2.getInput2().getTerminalValue());
		System.out.println(":" + NOR2.getOutput().getTerminalValue());

		System.out.println("Q: " + Q.getState());
//		System.out.println("Q2: " + Q2.getState());
		System.out.println("");
	}
}
