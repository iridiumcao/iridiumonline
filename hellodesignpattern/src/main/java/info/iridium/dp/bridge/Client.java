package info.iridium.dp.bridge;

/**
 * 
 * @author caoi
 * 
 * for http://www.iridiumcao.info/it/software-engineering/design-pattern/bridge
 *
 */
public class Client {

	public static void main(String[] args) {
		//这里选一些"最新鲜的香蕉"
		Fruit fresh0Banana = new FruitFresh0(new Orange());
		fresh0Banana.getFruitKind().hello();
	}

}
