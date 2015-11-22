package cn.Lionel.proxy.staticProxy;

public class GamePlayer implements IGamePlayer {

	private String name = "";
	
	
	public GamePlayer(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void login(String username, String passsword) {
		System.out.println(username+" �Ѿ���¼��");

	}

	@Override
	public void killBoss() {
		// TODO Auto-generated method stub
		System.out.println("ɱ����boss!");
	}

	@Override
	public void upgrade() {
		// TODO Auto-generated method stub
		System.out.println("��ϲ��������һ����");
	}

}
