package info.iridium.dp.adapter2;

public class Adapter implements Target {

	private Adaptee adaptee;
	
	public Adapter(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}

	@Override
	public void other() {
		System.out.println("This is Target.other()");
	}

	@Override
	public void specialRequest() {
		adaptee.specialRequest();
	}


}
