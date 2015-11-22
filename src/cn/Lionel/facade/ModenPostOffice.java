package cn.Lionel.facade;

public class ModenPostOffice {

	private ILetterProcess letterProcess = new LetterProcess() ;
	/*
	 * ��LetterProcess ����Ľӿ�ͨ��ͳһ�Ķ����װ�ӿ��ṩ����ʹ�ã�ʹ��LetterProcess������ʹ��
	 * 
	 */
	public void sendLetter(String context , String addr)
	{
		letterProcess.writerContext(context);
		letterProcess.fillEnvelope(addr);
		letterProcess.letterIntoEnvelope();
		letterProcess.sendLetter();
	}
	
}
