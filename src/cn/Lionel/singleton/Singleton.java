package cn.Lionel.singleton;

/**
 * 
 * ���ַ�����һ�ֶ���ʽ ��һ������ʽ
 * ����ʹ�ö���ʽ��synchronized̫��ʱ��
 * @author Lionel
 *
 */


public class Singleton {

	//��һ�ַ�������ʽ���Ƽ�ʹ��.
	 private static Singleton myInstance = new Singleton() ;
	 
	 private Singleton() {
	 
	 }
	 
	 public static Singleton getInstance() { return myInstance ; }
	 

	/*
	//�ڶ��ַ���������ʽ
	private static Singleton myInstance ;

	private Singleton() {

	}

	public static synchronized Singleton getInstance() {
		if(myInstance == null)
		{
			myInstance = new Singleton();
		}
		return myInstance ;
	}*/

}
