package info.iridium.dp.decorator;

public class Car {
	// 启动
	public void init() {
		try {
			// 随机暂停一段时间，模拟启动耗时
			Thread.sleep((long) (Math.random() * 100));
		} catch (InterruptedException ie) {
		}
		System.out.println("汽车启动了");
	}

	// 刹车
	public void stop() {
		try {
			// 随机暂停一段时间，模拟刹车耗时
			Thread.sleep((long) (Math.random() * 100));
		} catch (InterruptedException ie) {
		}
		System.out.println("刹车");
	}

	// “汽车”本身还有其他很多方法，暂就不写了。
}
