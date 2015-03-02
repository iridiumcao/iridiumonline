package info.iridium.dp.proxy2;

public class Client {

	public static void main(String[] args) {
		DynProxy proxy = new DynProxy();
		 //绑定该类实现的所有接口
        Subject sub = (Subject) proxy.bind(new RealSubject());
        sub.doAction();
	}

}
