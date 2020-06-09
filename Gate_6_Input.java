package logic;

public abstract class Gate_6_Input {

	protected Terminal input1;
	protected Terminal input2;
	protected Terminal input3;
	protected Terminal input4;
	protected Terminal input5;
	protected Terminal input6;
	protected Terminal output;

	public Gate_6_Input() {
		input1 = new Terminal();
		input2 = new Terminal();
		input3 = new Terminal();
		input4 = new Terminal();
		input5 = new Terminal();
		input6 = new Terminal();
		output = new Terminal();
	}
	
	public Terminal getInput1() {
		return input1;
	}
	
	public Terminal getInput2() {
		return input2;
	}
	
	public Terminal getInput3() {
		return input3;
	}
	
	public Terminal getInput4() {
		return input4;
	}
	
	public Terminal getInput5() {
		return input5;
	}
	
	public Terminal getInput6() {
		return input6;
	}
	
	public Terminal getOutput() {
		return output;
	}
	
	public void setInput1Value(int value) {
		input1.setTerminalValue(value);
	}
	
	public void setInput2Value(int value) {
		input2.setTerminalValue(value);
	}
	
	public void setInput3Value(int value) {
		input3.setTerminalValue(value);
	}
	
	public void setInput4Value(int value) {
		input4.setTerminalValue(value);
	}
	
	public void setInput5Value(int value) {
		input5.setTerminalValue(value);
	}
	
	public void setInput6Value(int value) {
		input6.setTerminalValue(value);
	}
	
	public abstract void energize();

}
