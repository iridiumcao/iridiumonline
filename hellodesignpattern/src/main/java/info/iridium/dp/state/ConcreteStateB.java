package info.iridium.dp.state;

public class ConcreteStateB implements State {

	@Override
	public void oper1() {
		System.out.println("state b, oper1");
	}

	@Override
	public void oper2() {
		System.out.println("state b, oper2");
	}

}
