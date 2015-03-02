package info.iridium.dp.command;

public class Client {

	public static void main(String[] args) {
		Receiver receiver = new DoggieReceiver();
		Command command = new EatingCommand(receiver);
		
		Invoker invoker = new Invoker();
		invoker.setCommand(command);
		invoker.runCommand();
	}

}
