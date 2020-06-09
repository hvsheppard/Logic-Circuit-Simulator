package logic;

public class Main9 {

	// This is the configuration for a 74LS74 BCD to 7-Segment Decoder

	//These are the components of the circuit
	private static NAND NAND1 = new NAND();
	private static NAND NAND2 = new NAND();
	private static NAND NAND3 = new NAND();
	private static NAND NAND4 = new NAND();
	private static NAND NAND5 = new NAND();
	private static NAND NAND6 = new NAND();
	private static NAND NAND7 = new NAND();
	private static NAND6 NAND61 = new NAND6();

	private static NOT NOT1 = new NOT();
	private static NOT NOT2 = new NOT();
	private static NOT NOT3 = new NOT();
	private static NOT NOT4 = new NOT();
	private static NOT NOT5 = new NOT();
	private static NOT NOT6 = new NOT();
	private static NOT NOT7 = new NOT();
	private static NOT NOT8 = new NOT();
	private static NOT NOT9 = new NOT();

	private static AND AND1 = new AND();
	private static AND AND2 = new AND();
	private static AND AND3 = new AND();
	private static AND AND4 = new AND();
	private static AND AND5 = new AND();
	private static AND AND6 = new AND();
	private static AND AND7 = new AND();

	private static AND3 AND31 = new AND3();
	private static AND3 AND32 = new AND3();
	private static AND3 AND33 = new AND3();
	private static AND3 AND34 = new AND3();
	private static AND3 AND35 = new AND3();
	private static AND3 AND36 = new AND3();
	private static AND3 AND37 = new AND3();
	private static AND3 AND38 = new AND3();
	
	private static AND4 AND41 = new AND4();
	private static AND4 AND42 = new AND4();
	
	private static NOR NOR1 = new NOR();
	private static NOR NOR2 = new NOR();
	private static NOR NOR3 = new NOR();

	private static NOR3 NOR31 = new NOR3();
	private static NOR3 NOR32 = new NOR3();
	private static NOR3 NOR33 = new NOR3();
	private static NOR3 NOR34 = new NOR3();
	
	private static Node INA = new Node();
	private static Node INB = new Node();
	private static Node INC = new Node();
	private static Node IND = new Node();

	private static Node BI = new Node();
	private static Node LT = new Node();
	private static Node RBI = new Node();
	
	private static LED SEGa = new LED();
	private static LED SEGb = new LED();
	private static LED SEGc = new LED();
	private static LED SEGd = new LED();
	private static LED SEGe = new LED();
	private static LED SEGf = new LED();
	private static LED SEGg = new LED();
	
	

	//These are the wires that connect the components together
	private static Wire wire01 = new Wire();
	private static Wire wire02 = new Wire();
	private static Wire wire03 = new Wire();
	private static Wire wire04 = new Wire();
	private static Wire wire05 = new Wire();
	private static Wire wire06 = new Wire();
	private static Wire wire07 = new Wire();
	private static Wire wire08 = new Wire();
	private static Wire wire09 = new Wire();
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
	private static Wire wire22 = new Wire();
	private static Wire wire23 = new Wire();
	private static Wire wire24 = new Wire();
	private static Wire wire25 = new Wire();
	private static Wire wire26 = new Wire();
	private static Wire wire27 = new Wire();
	private static Wire wire28 = new Wire();
	private static Wire wire29 = new Wire();
	private static Wire wire30 = new Wire();
	private static Wire wire31 = new Wire();
	private static Wire wire32 = new Wire();
	private static Wire wire33 = new Wire();
	private static Wire wire34 = new Wire();
	private static Wire wire35 = new Wire();
	private static Wire wire36 = new Wire();
	private static Wire wire37 = new Wire();
	private static Wire wire38 = new Wire();
	private static Wire wire39 = new Wire();
	private static Wire wire40 = new Wire();
	private static Wire wire41 = new Wire();
	private static Wire wire42 = new Wire();
	private static Wire wire43 = new Wire();
	private static Wire wire44 = new Wire();
	private static Wire wire45 = new Wire();
	private static Wire wire46 = new Wire();
	private static Wire wire47 = new Wire();
	private static Wire wire48 = new Wire();
	private static Wire wire49 = new Wire();
	private static Wire wire50 = new Wire();
	private static Wire wire51 = new Wire();
	private static Wire wire52 = new Wire();
	private static Wire wire53 = new Wire();
	private static Wire wire54 = new Wire();
	private static Wire wire55 = new Wire();
	private static Wire wire56 = new Wire();
	private static Wire wire57 = new Wire();
	private static Wire wire58 = new Wire();
	private static Wire wire59 = new Wire();
	private static Wire wire60 = new Wire();
	private static Wire wire61 = new Wire();
	private static Wire wire62 = new Wire();
	private static Wire wire63 = new Wire();
	private static Wire wire64 = new Wire();
	private static Wire wire65 = new Wire();
	private static Wire wire66 = new Wire();
	private static Wire wire67 = new Wire();
	private static Wire wire68 = new Wire();
	private static Wire wire69 = new Wire();
	private static Wire wire70 = new Wire();
	private static Wire wire71 = new Wire();
	private static Wire wire72 = new Wire();
	private static Wire wire73 = new Wire();
	private static Wire wire74 = new Wire();
	private static Wire wire75 = new Wire();
	private static Wire wire76 = new Wire();
	private static Wire wire77 = new Wire();
	private static Wire wire78 = new Wire();
	private static Wire wire79 = new Wire();
	private static Wire wire80 = new Wire();
	private static Wire wire81 = new Wire();
	private static Wire wire82 = new Wire();
	private static Wire wire83 = new Wire();
	private static Wire wire84 = new Wire();
	private static Wire wire85 = new Wire();
	private static Wire wire86 = new Wire();
	private static Wire wire87 = new Wire();
	private static Wire wire88 = new Wire();
	private static Wire wire89 = new Wire();
	private static Wire wire90 = new Wire();
	private static Wire wire91 = new Wire();
	private static Wire wire92 = new Wire();
	private static Wire wire93 = new Wire();
	private static Wire wire94 = new Wire();
	private static Wire wire95 = new Wire();
	private static Wire wire96 = new Wire();
	private static Wire wire97 = new Wire();
	private static Wire wire98 = new Wire();
	private static Wire wire99 = new Wire();
	private static Wire wire100 = new Wire();
	private static Wire wire101 = new Wire();
	private static Wire wire102 = new Wire();
	private static Wire wire103 = new Wire();
	private static Wire wire104 = new Wire();
	
	private static char segmentA = ' '; 
	private static char segmentB = ' '; 
	private static char segmentC = ' '; 
	private static char segmentD = ' '; 
	private static char segmentE = ' '; 
	private static char segmentF = ' '; 
	private static char segmentG = ' '; 
	
	private static char valueA = '_'; 
	private static char valueB = '|'; 
	private static char valueC = '|'; 
	private static char valueD = '_'; 
	private static char valueE = '|'; 
	private static char valueF = '|'; 
	private static char valueG = '_'; 
	
	public static void main(String[] args) {

		//This is how we connect the wires to the components
		wire01.connect(INA.getOutput(), NAND1.getInput1());
		wire02.connect(INB.getOutput(), NAND2.getInput1());
		wire03.connect(INC.getOutput(), NAND3.getInput1());
		wire04.connect(IND.getOutput(), NOT1.getInput());
		wire05.connect(BI.getOutput(), NAND4.getInput2());
		wire06.connect(BI.getOutput(), NAND5.getInput2());
		wire07.connect(BI.getOutput(), NAND6.getInput2());
		wire08.connect(BI.getOutput(), NAND7.getInput2());
		wire09.connect(LT.getOutput(), NAND61.getInput1());
		wire10.connect(LT.getOutput(), NAND1.getInput2());
		wire11.connect(LT.getOutput(), NAND2.getInput2());
		wire12.connect(LT.getOutput(), NAND3.getInput2());
		wire13.connect(LT.getOutput(), AND42.getInput4());
		wire14.connect(RBI.getOutput(), NOT2.getInput());
		wire15.connect(NOT2.getOutput(), NAND61.getInput2());
		wire16.connect(NAND1.getOutput(), NAND4.getInput1());
		wire17.connect(NAND2.getOutput(), NAND5.getInput1());
		wire18.connect(NAND3.getOutput(), NAND6.getInput1());
		wire19.connect(NOT1.getOutput(), NAND7.getInput1());
		wire20.connect(NAND1.getOutput(), AND2.getInput1());
		wire21.connect(NAND1.getOutput(), AND32.getInput1());
		wire22.connect(NAND1.getOutput(), AND33.getInput1());
		wire23.connect(NAND1.getOutput(), AND35.getInput1());
		wire24.connect(NAND1.getOutput(), NAND61.getInput6());
		wire25.connect(NAND4.getOutput(), AND41.getInput1());
		wire26.connect(NAND4.getOutput(), AND31.getInput1());
		wire27.connect(NAND4.getOutput(), AND34.getInput1());
		wire28.connect(NAND4.getOutput(), AND36.getInput1());
		wire29.connect(NAND4.getOutput(), NOR2.getInput1());
		wire30.connect(NAND4.getOutput(), AND6.getInput1());
		wire31.connect(NAND4.getOutput(), AND37.getInput1());
		wire32.connect(NAND4.getOutput(), AND38.getInput1());
		wire33.connect(NAND2.getOutput(), AND41.getInput2());
		wire34.connect(NAND2.getOutput(), AND31.getInput2());
		wire35.connect(NAND2.getOutput(), AND34.getInput2());
		wire36.connect(NAND2.getOutput(), AND35.getInput2());
		wire37.connect(NAND2.getOutput(), AND5.getInput1());
		wire38.connect(NAND2.getOutput(), NAND61.getInput5());
		wire39.connect(NAND2.getOutput(), AND42.getInput1());
		wire40.connect(NAND5.getOutput(), AND1.getInput1());
		wire41.connect(NAND5.getOutput(), AND3.getInput1());
		wire42.connect(NAND5.getOutput(), AND32.getInput2());
		wire43.connect(NAND5.getOutput(), AND33.getInput2());
		wire44.connect(NAND5.getOutput(), AND36.getInput2());
		wire45.connect(NAND5.getOutput(), AND6.getInput2());
		wire46.connect(NAND5.getOutput(), AND7.getInput1());
		wire47.connect(NAND5.getOutput(), AND38.getInput2());
		wire48.connect(NAND3.getOutput(), AND41.getInput3());
		wire49.connect(NAND3.getOutput(), AND33.getInput3());
		wire50.connect(NAND3.getOutput(), AND34.getInput3());
		wire51.connect(NAND3.getOutput(), NAND61.getInput4());
		wire52.connect(NAND3.getOutput(), AND7.getInput2());
		wire53.connect(NAND3.getOutput(), AND37.getInput2());
		wire54.connect(NAND3.getOutput(), AND42.getInput2());
		wire55.connect(NAND6.getOutput(), AND2.getInput2());
		wire56.connect(NAND6.getOutput(), AND31.getInput3());
		wire57.connect(NAND6.getOutput(), AND32.getInput3());
		wire58.connect(NAND6.getOutput(), AND4.getInput1());
		wire59.connect(NAND6.getOutput(), AND35.getInput3());
		wire60.connect(NAND6.getOutput(), AND36.getInput3());
		wire61.connect(NAND6.getOutput(), AND5.getInput2());
		wire62.connect(NAND6.getOutput(), AND38.getInput3());
		wire63.connect(NOT1.getOutput(), NAND61.getInput3());
		wire64.connect(NOT1.getOutput(), AND37.getInput3());
		wire65.connect(NOT1.getOutput(), AND42.getInput3());
		wire66.connect(NAND7.getOutput(), AND1.getInput2());
		wire67.connect(NAND7.getOutput(), AND3.getInput2());
		wire68.connect(NAND7.getOutput(), AND4.getInput2());
		wire69.connect(AND1.getOutput(), NOR31.getInput1());
		wire70.connect(AND2.getOutput(), NOR31.getInput2());
		wire71.connect(AND41.getOutput(), NOR31.getInput3());
		wire72.connect(AND3.getOutput(), NOR32.getInput1());
		wire73.connect(AND31.getOutput(), NOR32.getInput2());
		wire74.connect(AND32.getOutput(), NOR32.getInput3());
		wire75.connect(AND4.getOutput(), NOR1.getInput1());
		wire76.connect(AND33.getOutput(), NOR1.getInput2());
		wire77.connect(AND34.getOutput(), NOR33.getInput1());
		wire78.connect(AND35.getOutput(), NOR33.getInput2());
		wire79.connect(AND36.getOutput(), NOR33.getInput3());
		wire80.connect(AND5.getOutput(), NOR2.getInput2());
		wire81.connect(AND6.getOutput(), NOR34.getInput1());
		wire82.connect(AND7.getOutput(), NOR34.getInput2());
		wire83.connect(AND37.getOutput(), NOR34.getInput3());
		wire84.connect(AND38.getOutput(), NOR3.getInput1());
		wire85.connect(AND42.getOutput(), NOR3.getInput2());
		wire86.connect(NOR31.getOutput(), NOT3.getInput());
		wire87.connect(NOR32.getOutput(), NOT4.getInput());
		wire88.connect(NOR1.getOutput(), NOT5.getInput());
		wire89.connect(NOR33.getOutput(), NOT6.getInput());
		wire90.connect(NOR2.getOutput(), NOT7.getInput());
		wire91.connect(NOR34.getOutput(), NOT8.getInput());
		wire92.connect(NOR3.getOutput(), NOT9.getInput());
		wire93.connect(NOT3.getOutput(), SEGa.getInput());
		wire94.connect(NOT4.getOutput(), SEGb.getInput());
		wire95.connect(NOT5.getOutput(), SEGc.getInput());
		wire96.connect(NOT6.getOutput(), SEGd.getInput());
		wire97.connect(NOT7.getOutput(), SEGe.getInput());
		wire98.connect(NOT8.getOutput(), SEGf.getInput());
		wire99.connect(NOT9.getOutput(), SEGg.getInput());
		wire100.connect(NOT1.getOutput(), AND41.getInput4());
		wire101.connect(NAND61.output, NAND4.input2);
		wire102.connect(NAND61.output, NAND5.input2);
		wire103.connect(NAND61.output, NAND6.input2);
		wire104.connect(NAND61.output, NAND7.input2);
		
		//This is how we set the initial values of the inputs
		BI.setOutputValue(1);		// I'm not sure what this one does
		LT.setOutputValue(1);		// Setting this low will cause all combinations to display 8
		RBI.setOutputValue(1);		// Setting this low will cause the zero to be blank

		System.out.println("7-Segment LED Display:");

		int temp;
		int divisor;
		int a, b, c, d;
		
		for (int i = 0; i < 16; i++) {
			temp = i;
			divisor = 8;

			d = temp/divisor;
			temp = temp - (d * divisor);
			divisor /= 2;

			c = temp/divisor;
			temp = temp - (c * divisor);
			divisor /= 2;

			b = temp/divisor;
			temp = temp - (b * divisor);
			divisor /= 2;

			a = temp/divisor;

			System.out.print(d);
			System.out.print(c);
			System.out.print(b);
			System.out.println(a);

			System.out.println(i);
			INA.setOutputValue(a); // LSB
			INB.setOutputValue(b);
			INC.setOutputValue(c);
			IND.setOutputValue(d); // MSB
			run();
		}
			
	}

	static void run() {
		//This is how we evaluate the conditions of the parts - the order is important
		wire01.energize();
		wire02.energize();
		wire03.energize();
		wire04.energize();
		wire10.energize();
		wire11.energize();
		wire12.energize();
		wire13.energize();
		wire09.energize();
		NAND1.energize();
		NAND2.energize();
		NAND3.energize();
		NOT1.energize();
		wire16.energize();
		wire17.energize();
		wire18.energize();
		wire19.energize();
		wire05.energize();
		wire06.energize();
		wire07.energize();

		NAND4.energize();
		NAND5.energize();
		NAND6.energize();
		NAND7.energize();
		wire14.energize();
		NOT2.energize();
		wire15.energize();
		wire20.energize();
		wire21.energize();
		wire22.energize();
		wire23.energize();
		wire24.energize();
		wire25.energize();
		wire26.energize();
		wire27.energize();
		wire28.energize();
		wire29.energize();
		wire30.energize();
		wire31.energize();
		wire32.energize();
		wire33.energize();
		wire34.energize();
		wire35.energize();
		wire36.energize();
		wire37.energize();
		wire38.energize();
		wire39.energize();
		wire40.energize();
		wire41.energize();
		wire42.energize();
		wire43.energize();
		wire44.energize();
		wire45.energize();
		wire46.energize();
		wire47.energize();
		wire48.energize();
		wire49.energize();
		wire50.energize();
		wire51.energize();
		wire52.energize();
		wire53.energize();
		wire54.energize();
		wire55.energize();
		wire56.energize();
		wire57.energize();
		wire58.energize();
		wire59.energize();
		wire60.energize();
		wire61.energize();
		wire62.energize();
		wire100.energize();
		wire63.energize();
		wire64.energize();
		wire65.energize();
		wire66.energize();
		wire67.energize();
		wire68.energize();
		NAND61.energize();
		wire101.energize();
		wire102.energize();
		wire103.energize();
		wire104.energize();
		
		NAND4.energize();    //again
		NAND5.energize();
		NAND6.energize();
		NAND7.energize();
		wire14.energize();
		NOT2.energize();
		wire15.energize();
		wire20.energize();
		wire21.energize();
		wire22.energize();
		wire23.energize();
		wire24.energize();
		wire25.energize();
		wire26.energize();
		wire27.energize();
		wire28.energize();
		wire29.energize();
		wire30.energize();
		wire31.energize();
		wire32.energize();
		wire33.energize();
		wire34.energize();
		wire35.energize();
		wire36.energize();
		wire37.energize();
		wire38.energize();
		wire39.energize();
		wire40.energize();
		wire41.energize();
		wire42.energize();
		wire43.energize();
		wire44.energize();
		wire45.energize();
		wire46.energize();
		wire47.energize();
		wire48.energize();
		wire49.energize();
		wire50.energize();
		wire51.energize();
		wire52.energize();
		wire53.energize();
		wire54.energize();
		wire55.energize();
		wire56.energize();
		wire57.energize();
		wire58.energize();
		wire59.energize();
		wire60.energize();
		wire61.energize();
		wire62.energize();
		wire100.energize();
		wire63.energize();
		wire64.energize();
		wire65.energize();
		wire66.energize();
		wire67.energize();
		wire68.energize();
		
		AND1.energize();
		AND2.energize();
		AND41.energize();
		AND3.energize();
		AND31.energize();
		AND32.energize();
		AND4.energize();
		AND33.energize();
		AND34.energize();
		AND35.energize();
		AND36.energize();
		AND5.energize();
		AND6.energize();
		AND7.energize();
		AND37.energize();
		AND38.energize();
		AND42.energize();
		wire69.energize();
		wire70.energize();
		wire71.energize();
		wire72.energize();
		wire73.energize();
		wire74.energize();
		wire75.energize();
		wire76.energize();
		wire77.energize();
		wire78.energize();
		wire79.energize();
		wire80.energize();
		wire81.energize();
		wire82.energize();
		wire83.energize();
		wire84.energize();
		wire85.energize();
		NOR31.energize();
		NOR32.energize();
		NOR1.energize();
		NOR33.energize();
		NOR2.energize();
		NOR34.energize();
		NOR3.energize();
		wire86.energize();
		wire87.energize();
		wire88.energize();
		wire89.energize();
		wire90.energize();
		wire91.energize();
		wire92.energize();
		NOT3.energize();
		NOT4.energize();
		NOT5.energize();
		NOT6.energize();
		NOT7.energize();
		NOT8.energize();
		NOT9.energize();
		wire93.energize();
		wire94.energize();
		wire95.energize();
		wire96.energize();
		wire97.energize();
		wire98.energize();
		wire99.energize();
		SEGa.energize();
		SEGb.energize();
		SEGc.energize();
		SEGd.energize();
		SEGe.energize();
		SEGf.energize();
		SEGg.energize();
		
/*
		// This is to display the output for debugging, or just seeing the process

		System.out.print("Input: ");
		System.out.print(IND.getOutput().getTerminalValue());
		System.out.print(INC.getOutput().getTerminalValue());
		System.out.print(INB.getOutput().getTerminalValue());
		System.out.println(INA.getOutput().getTerminalValue());

		System.out.print("BI: " + BI.getOutput().getTerminalValue());
		System.out.print(" LT: " + LT.getOutput().getTerminalValue());
		System.out.println(" RBI: " + RBI.getOutput().getTerminalValue());

		System.out.print("NAND1: " + NAND1.getInput1().getTerminalValue());
		System.out.print("+" + NAND1.getInput2().getTerminalValue());
		System.out.println(":" + NAND1.getOutput().getTerminalValue());

		System.out.print("NAND2: " + NAND2.getInput1().getTerminalValue());
		System.out.print("+" + NAND2.getInput2().getTerminalValue());
		System.out.println(":" + NAND2.getOutput().getTerminalValue());

		System.out.print("NAND3: " + NAND3.getInput1().getTerminalValue());
		System.out.print("+" + NAND3.getInput2().getTerminalValue());
		System.out.println(":" + NAND3.getOutput().getTerminalValue());

		System.out.print("NOT1: " + NOT1.getInput().getTerminalValue());
		System.out.println(":" + NOT1.getOutput().getTerminalValue());

		System.out.println("");

		System.out.print("NAND4: " + NAND4.getInput1().getTerminalValue());
		System.out.print("+" + NAND4.getInput2().getTerminalValue());
		System.out.println(":" + NAND4.getOutput().getTerminalValue());

		System.out.print("NAND5: " + NAND5.getInput1().getTerminalValue());
		System.out.print("+" + NAND5.getInput2().getTerminalValue());
		System.out.println(":" + NAND5.getOutput().getTerminalValue());

		System.out.print("NAND6: " + NAND6.getInput1().getTerminalValue());
		System.out.print("+" + NAND6.getInput2().getTerminalValue());
		System.out.println(":" + NAND6.getOutput().getTerminalValue());

		System.out.print("NAND7: " + NAND7.getInput1().getTerminalValue());
		System.out.print("+" + NAND7.getInput2().getTerminalValue());
		System.out.println(":" + NAND7.getOutput().getTerminalValue());

		System.out.println("");

		System.out.print("NAND61: " + NAND61.getInput1().getTerminalValue());
		System.out.print("+" + NAND61.getInput2().getTerminalValue());
		System.out.print("+" + NAND61.getInput3().getTerminalValue());
		System.out.print("+" + NAND61.getInput4().getTerminalValue());
		System.out.print("+" + NAND61.getInput5().getTerminalValue());
		System.out.print("+" + NAND61.getInput6().getTerminalValue());
		System.out.println(":" + NAND61.getOutput().getTerminalValue());

		System.out.println("");
		  
		System.out.println("Segment a");

		System.out.print("AND1: " + AND1.getInput1().getTerminalValue());
		System.out.print("+" + AND1.getInput2().getTerminalValue());
		System.out.println(":" + AND1.getOutput().getTerminalValue());

		System.out.print("AND2: " + AND2.getInput1().getTerminalValue());
		System.out.print("+" + AND2.getInput2().getTerminalValue());
		System.out.println(":" + AND2.getOutput().getTerminalValue());

		System.out.print("AND41: " + AND41.getInput1().getTerminalValue());
		System.out.print("+" + AND41.getInput2().getTerminalValue());
		System.out.print("+" + AND41.getInput3().getTerminalValue());
		System.out.print("+" + AND41.getInput4().getTerminalValue());
		System.out.println(":" + AND41.getOutput().getTerminalValue());

		System.out.print("NOR31: " + NOR31.getInput1().getTerminalValue());
		System.out.print("+" + NOR31.getInput2().getTerminalValue());
		System.out.print("+" + NOR31.getInput3().getTerminalValue());
		System.out.println(":" + NOR31.getOutput().getTerminalValue());

		System.out.print("NOT3: " + NOT3.getInput().getTerminalValue());
		System.out.println(":" + NOT3.getOutput().getTerminalValue());
		System.out.println("SEGa: " + SEGa.getState());

		System.out.println("");
		  
		System.out.println("Segment b");

		System.out.print("AND3: " + AND3.getInput1().getTerminalValue());
		System.out.print("+" + AND3.getInput2().getTerminalValue());
		System.out.println(":" + AND3.getOutput().getTerminalValue());

		System.out.print("AND31: " + AND31.getInput1().getTerminalValue());
		System.out.print("+" + AND31.getInput2().getTerminalValue());
		System.out.print("+" + AND31.getInput3().getTerminalValue());
		System.out.println(":" + AND31.getOutput().getTerminalValue());

		System.out.print("AND32: " + AND32.getInput1().getTerminalValue());
		System.out.print("+" + AND32.getInput2().getTerminalValue());
		System.out.print("+" + AND32.getInput3().getTerminalValue());
		System.out.println(":" + AND32.getOutput().getTerminalValue());

		System.out.print("NOR32: " + NOR32.getInput1().getTerminalValue());
		System.out.print("+" + NOR32.getInput2().getTerminalValue());
		System.out.print("+" + NOR32.getInput3().getTerminalValue());
		System.out.println(":" + NOR32.getOutput().getTerminalValue());

		System.out.print("NOT4: " + NOT4.getInput().getTerminalValue());
		System.out.println(":" + NOT4.getOutput().getTerminalValue());
		System.out.println("SEGb: " + SEGb.getState());

		System.out.println("");

		System.out.println("Segment c");

		System.out.print("AND4: " + AND4.getInput1().getTerminalValue());
		System.out.print("+" + AND4.getInput2().getTerminalValue());
		System.out.println(":" + AND4.getOutput().getTerminalValue());

		System.out.print("AND33: " + AND33.getInput1().getTerminalValue());
		System.out.print("+" + AND33.getInput2().getTerminalValue());
		System.out.print("+" + AND33.getInput3().getTerminalValue());
		System.out.println(":" + AND33.getOutput().getTerminalValue());

		System.out.print("NOR1: " + NOR1.getInput1().getTerminalValue());
		System.out.print("+" + NOR1.getInput2().getTerminalValue());
		System.out.println(":" + NOR1.getOutput().getTerminalValue());

		System.out.print("NOT5: " + NOT5.getInput().getTerminalValue());
		System.out.println(":" + NOT5.getOutput().getTerminalValue());
		System.out.println("SEGc: " + SEGc.getState());

		System.out.println("");

		System.out.println("Segment d");

		System.out.print("AND34: " + AND34.getInput1().getTerminalValue());
		System.out.print("+" + AND34.getInput2().getTerminalValue());
		System.out.print("+" + AND34.getInput3().getTerminalValue());
		System.out.println(":" + AND34.getOutput().getTerminalValue());

		System.out.print("AND35: " + AND35.getInput1().getTerminalValue());
		System.out.print("+" + AND35.getInput2().getTerminalValue());
		System.out.print("+" + AND35.getInput3().getTerminalValue());
		System.out.println(":" + AND35.getOutput().getTerminalValue());

		System.out.print("AND36: " + AND36.getInput1().getTerminalValue());
		System.out.print("+" + AND36.getInput2().getTerminalValue());
		System.out.print("+" + AND36.getInput3().getTerminalValue());
		System.out.println(":" + AND36.getOutput().getTerminalValue());

		System.out.print("NOR33: " + NOR33.getInput1().getTerminalValue());
		System.out.print("+" + NOR33.getInput2().getTerminalValue());
		System.out.print("+" + NOR33.getInput3().getTerminalValue());
		System.out.println(":" + NOR33.getOutput().getTerminalValue());

		System.out.print("NOT6: " + NOT6.getInput().getTerminalValue());
		System.out.println(":" + NOT6.getOutput().getTerminalValue());
		System.out.println("SEGd: " + SEGd.getState());

		System.out.println("");

		System.out.println("Segment e");

		System.out.print("AND5: " + AND5.getInput1().getTerminalValue());
		System.out.print("+" + AND5.getInput2().getTerminalValue());
		System.out.println(":" + AND5.getOutput().getTerminalValue());

		System.out.print("NOR2: " + NOR2.getInput1().getTerminalValue());
		System.out.print("+" + NOR2.getInput2().getTerminalValue());
		System.out.println(":" + NOR2.getOutput().getTerminalValue());

		System.out.print("NOT7: " + NOT7.getInput().getTerminalValue());
		System.out.println(":" + NOT7.getOutput().getTerminalValue());
		System.out.println("SEGe: " + SEGe.getState());

		System.out.println("");
		  
		System.out.println("Segment f");

		System.out.print("AND6: " + AND6.getInput1().getTerminalValue());
		System.out.print("+" + AND6.getInput2().getTerminalValue());
		System.out.println(":" + AND6.getOutput().getTerminalValue());

		System.out.print("AND7: " + AND7.getInput1().getTerminalValue());
		System.out.print("+" + AND7.getInput2().getTerminalValue());
		System.out.println(":" + AND7.getOutput().getTerminalValue());

		System.out.print("AND37: " + AND37.getInput1().getTerminalValue());
		System.out.print("+" + AND37.getInput2().getTerminalValue());
		System.out.print("+" + AND37.getInput3().getTerminalValue());
		System.out.println(":" + AND37.getOutput().getTerminalValue());

		System.out.print("NOR34: " + NOR34.getInput1().getTerminalValue());
		System.out.print("+" + NOR34.getInput2().getTerminalValue());
		System.out.print("+" + NOR34.getInput3().getTerminalValue());
		System.out.println(":" + NOR34.getOutput().getTerminalValue());

		System.out.print("NOT8: " + NOT8.getInput().getTerminalValue());
		System.out.println(":" + NOT8.getOutput().getTerminalValue());
		System.out.println("SEGf: " + SEGf.getState());

		System.out.println("");
		  
		System.out.println("Segment g");

		System.out.print("AND38: " + AND38.getInput1().getTerminalValue());
		System.out.print("+" + AND38.getInput2().getTerminalValue());
		System.out.print("+" + AND38.getInput3().getTerminalValue());
		System.out.println(":" + AND38.getOutput().getTerminalValue());

		System.out.print("AND42: " + AND42.getInput1().getTerminalValue());
		System.out.print("+" + AND42.getInput2().getTerminalValue());
		System.out.print("+" + AND42.getInput3().getTerminalValue());
		System.out.print("+" + AND42.getInput4().getTerminalValue());
		System.out.println(":" + AND42.getOutput().getTerminalValue());

		System.out.print("NOR3: " + NOR3.getInput1().getTerminalValue());
		System.out.print("+" + NOR3.getInput2().getTerminalValue());
		System.out.println(":" + NOR3.getOutput().getTerminalValue());

		System.out.print("NOT9: " + NOT9.getInput().getTerminalValue());
		System.out.println(":" + NOT9.getOutput().getTerminalValue());
		System.out.println("SEGg: " + SEGg.getState());

		System.out.println("");

		System.out.println("SEGa: " + SEGa.getState());
		System.out.println("SEGb: " + SEGb.getState());
		System.out.println("SEGc: " + SEGc.getState());
		System.out.println("SEGd: " + SEGd.getState());
		System.out.println("SEGe: " + SEGe.getState());
		System.out.println("SEGf: " + SEGf.getState());
		System.out.println("SEGg: " + SEGg.getState());
		System.out.println("");
*/

		segmentA = segmentB = segmentC = segmentD = segmentE = segmentF = segmentG = ' ';

		if (SEGa.getState().equals("OFF")) {segmentA = valueA;}
		if (SEGb.getState().equals("OFF")) {segmentB = valueB;}
		if (SEGc.getState().equals("OFF")) {segmentC = valueC;}
		if (SEGd.getState().equals("OFF")) {segmentD = valueD;}
		if (SEGe.getState().equals("OFF")) {segmentE = valueE;}
		if (SEGf.getState().equals("OFF")) {segmentF = valueF;}
		if (SEGg.getState().equals("OFF")) {segmentG = valueG;}
		
		// Draw the character
		System.out.println("     " + ' ' + segmentA + ' ');
		System.out.println("     " + segmentF + segmentG + segmentB);
		System.out.println("     " + segmentE + segmentD + segmentC);
		
		System.out.println("");
		
	}

}


/*

A character set

Note: This is not the same as the character set of the 74LS47
           _   _         _    _    _    _    _    _    _                   _    _ 
       |   _|  _|  |_|  |_   |_     |  |_|  |_|  | |  |_|  |_    _    _|  |_   |_ 
       |  |_   _|    |   _|  |_|    |  |_|   _|  |_|  | |  |_|  |_   |_|  |_   |  
       
*/

