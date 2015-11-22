package cn.Lionel.facade;

public interface ILetterProcess {

	public void writerContext(String context) ;
	
	public void fillEnvelope(String addr) ;
	
	public void letterIntoEnvelope() ;
	
	public void sendLetter() ;
	
}
