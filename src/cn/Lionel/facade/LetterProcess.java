package cn.Lionel.facade;

public class LetterProcess implements ILetterProcess {

	@Override
	public void writerContext(String context) {
		System.out.println("д����!...�����ǣ�"+context);
	}

	@Override
	public void fillEnvelope(String addr) {
		
		System.out.println("��д�ŷ⣡...��ַ�ǣ�"+addr);
	}

	@Override
	public void letterIntoEnvelope() {
		System.out.println("����װ���ŷ⣡...");

	}

	@Override
	public void sendLetter() {
		
		System.out.println("�ʵ��ż�!...");
		
	}

}
