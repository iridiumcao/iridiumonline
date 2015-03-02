package info.iridium.dp.state;

/**
 * 
 * @author caoi
 * 
 * for http://www.iridiumcao.info/it/software-engineering/design-pattern/state
 *
 */
public class Client {
	public static void main(String[] args) {
		Context contex = new Context();

		State stateA = new ConcreteStateA();
		contex.setState(stateA);
		contex.oper1();
		contex.oper2();

//		State stateB = new ConcreteStateB();
//		contex.setState(stateB);
//		contex.oper1();
//		contex.oper2();
//		
//		State stateC = new ConcreteStateC();
//		contex.setState(stateC);
//		contex.oper1();
//		contex.oper2();
	}
}
