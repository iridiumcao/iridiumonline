package info.iridium.dp.state;

public class ConcreteStateA implements State {

	@Override
	public void oper1() {
		System.out.println("state a, oper1");
	}

	@Override
	public void oper2() {
		System.out.println("state a, oper2");
	}

}
