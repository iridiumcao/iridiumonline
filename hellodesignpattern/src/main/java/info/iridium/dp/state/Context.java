package info.iridium.dp.state;

public class Context {
	private State state;

	public void oper1() {
		state.oper1();
	}

	public void oper2() {
		state.oper2();
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

}
