package cn.Lionel.facade;

public class ModenPostOffice {

	private ILetterProcess letterProcess = new LetterProcess() ;
	/*
	 * 将LetterProcess 对外的接口通过统一的对象封装接口提供对外使用，使得LetterProcess更容易使用
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
