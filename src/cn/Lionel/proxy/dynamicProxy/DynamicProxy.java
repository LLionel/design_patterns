package cn.Lionel.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import org.junit.Test;

public class DynamicProxy {

	@Test
	public void test1()
	{
		IGamePlayer player = new GamePlayer("уехЩ"); 
		InvocationHandler handler = new GamePlayIH(player);
		System.out.println(System.currentTimeMillis());
		ClassLoader loader = this.getClass().getClassLoader();
		IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(loader, new Class[]{IGamePlayer.class} , handler ) ;
		proxy.login("zhangsan", "password");
		proxy.killBoss();
		proxy.upgrade();
	}
}
