package info.iridium.dp.adapter1;

public class Adapter extends Adaptee implements Target {

	@Override
	public void other() {
		System.out.println("This is Target.other()");
	}


}
