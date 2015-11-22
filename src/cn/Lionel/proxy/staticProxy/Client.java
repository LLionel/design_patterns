package cn.Lionel.proxy.staticProxy;

import org.junit.Test;

public class Client {

	@Test
	public void test() 
	{
		IGamePlayer player = new GamePlayer("����") ;
		StaticProxy proxy = new StaticProxy(player) ;
		proxy.login("����","password") ;
		proxy.killBoss();
		proxy.upgrade() ;
	}
	
}
