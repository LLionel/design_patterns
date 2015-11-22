package cn.Lionel.facade;

public class LetterProcess implements ILetterProcess {

	@Override
	public void writerContext(String context) {
		System.out.println("写信啦!...内容是："+context);
	}

	@Override
	public void fillEnvelope(String addr) {
		
		System.out.println("填写信封！...地址是："+addr);
	}

	@Override
	public void letterIntoEnvelope() {
		System.out.println("把信装入信封！...");

	}

	@Override
	public void sendLetter() {
		
		System.out.println("邮递信件!...");
		
	}

}
