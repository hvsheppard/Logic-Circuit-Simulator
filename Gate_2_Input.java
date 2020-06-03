package Logic;

public abstract class Gate_2_Input {

	protected Terminal input1;
	protected Terminal input2;
	protected Terminal output;

	public Gate_2_Input() {
		input1 = new Terminal();
		input2 = new Terminal();
		output = new Terminal();
	}
	
	public Terminal getInput1() {
		return input1;
	}
	
	public Terminal getInput2() {
		return input2;
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
	
	public abstract void evaluate();

}
