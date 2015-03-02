package info.iridium.dp.decorator;

public class Client {

	public static void main(String[] args) {
		Car car = new DecoratedCar();
		car.init();
		car.stop();
	}

}
