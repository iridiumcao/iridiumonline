package info.iridium.dp.proxy1;

public class Client {

	public static void main(String[] args) {
		Subject hello = new Proxy();
		hello.doAction();
	}

}
