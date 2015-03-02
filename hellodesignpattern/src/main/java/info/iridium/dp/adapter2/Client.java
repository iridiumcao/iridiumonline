package info.iridium.dp.adapter2;

public class Client {

	public static void main(String[] args) {
		Target t = new Adapter(new Adaptee());
		t.specialRequest();
	}

}
