package cn.Lionel.proxy.staticProxy;

import org.junit.Test;

public class Client {

	@Test
	public void test() 
	{
		IGamePlayer player = new GamePlayer("张三") ;
		StaticProxy proxy = new StaticProxy(player) ;
		proxy.login("张三","password") ;
		proxy.killBoss();
		proxy.upgrade() ;
	}
	
}
