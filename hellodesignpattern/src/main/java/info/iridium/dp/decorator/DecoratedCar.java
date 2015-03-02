package info.iridium.dp.decorator;

public class DecoratedCar extends Car {

	@Override
	public void init() {
		long start = System.currentTimeMillis();
		super.init();
		long end = System.currentTimeMillis();
		System.out.println("启动耗时：" + (end - start) + "毫秒");
	}

	@Override
	public void stop() {
		long start = System.currentTimeMillis();
		super.stop();
		long end = System.currentTimeMillis();
		System.out.println("刹车耗时：" + (end - start) + "毫秒");
	}

}
