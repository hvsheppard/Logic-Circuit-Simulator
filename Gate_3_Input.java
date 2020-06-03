package Logic;

public abstract class Gate_3_Input {

	protected Terminal input1;
	protected Terminal input2;
	protected Terminal input3;
	protected Terminal output;

	public Gate_3_Input() {
		input1 = new Terminal();
		input2 = new Terminal();
		input3 = new Terminal();
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
	
	public abstract void energize();

}
