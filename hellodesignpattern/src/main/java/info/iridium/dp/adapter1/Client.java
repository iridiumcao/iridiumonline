package info.iridium.dp.adapter1;

public class Client {

	public static void main(String[] args) {
		Target t = new Adapter();
		t.specialRequest();
	}

}
