package cn.Lionel.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayIH implements InvocationHandler {

	Class clazz = null ;
	
	Object obj = null ;
	
	
	public GamePlayIH(Object obj) {
		super();
		this.obj = obj;
	}



	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		Object result = method.invoke(this.obj, args);
		return result;
	}

}
