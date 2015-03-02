package info.iridium.dp.proxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynProxy implements InvocationHandler {

	private Object tar;

	public Object bind(Object tar) {
		this.tar = tar;
		return Proxy.newProxyInstance(tar.getClass().getClassLoader(), tar
				.getClass().getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("before proxy");
		Object result = null;
		// 这里就可以进行所谓的AOP编程了
		// 在调用具体函数方法前，执行功能处理
		result = method.invoke(tar, args);
		// 在调用具体函数方法后，执行功能处理
		System.out.println("after proxy");
		return result;
	}

}
