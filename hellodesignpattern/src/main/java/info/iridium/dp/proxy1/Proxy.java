package info.iridium.dp.proxy1;

public class Proxy implements Subject {

	@Override
	public void doAction() {
		System.out.println("before proxy");
		new RealSubject().doAction();
		System.out.println("after proxy");
	}

}
