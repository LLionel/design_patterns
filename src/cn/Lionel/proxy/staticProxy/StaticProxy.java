package cn.Lionel.proxy.staticProxy;

public class StaticProxy implements IGamePlayer{

	private IGamePlayer player ;

	
	
	public StaticProxy(IGamePlayer player) {
		super();
		this.player = player;
	}

	@Override
	public void login(String username, String passsword) {

		player.login(username, passsword);
	}

	@Override
	public void killBoss() {
		player.killBoss();
	}

	@Override
	public void upgrade() {
		player.upgrade();
	}
	
	
}
