package Logic;

public class Node {

	protected Terminal output;

	public Node() {
		output = new Terminal();
	}
	
	public Terminal getOutput() {
		return output;
	}
	
	public void setOutputValue(int value) {
		output.setTerminalValue(value);
	}
	
}
