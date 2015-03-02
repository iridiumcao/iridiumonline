package info.iridium.dp.command;

public class EatingCommand implements Command {
	
	private Receiver receiver;
	
	public EatingCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.action();
	}

}
