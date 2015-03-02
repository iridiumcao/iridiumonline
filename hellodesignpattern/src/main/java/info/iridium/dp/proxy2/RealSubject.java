package info.iridium.dp.proxy2;

public class RealSubject implements Subject {

	@Override
	public void doAction() {
		System.out.println("Hello from realSubject.doAction()!");
	}

}
