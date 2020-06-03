package Logic;

public class LED {

	private Terminal input;
	private String state;

	public LED() {
		input = new Terminal();
		state = "";
		}
	
	public Terminal getInput() {
		return input;
	}

	public String getState() {
		return state;
	}

	public void energize() {
		if (input.getTerminalValue() == 1)
			state = "ON";
		else
			state = "OFF";
	}
}
