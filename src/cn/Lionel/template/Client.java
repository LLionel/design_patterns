package cn.Lionel.template;

import org.junit.Test;

public class Client {

	@Test
	public void test()
	{
		AbstractClass class1 = new ConcreteClass1() ;
		AbstractClass class2 = new ConcreteClass2() ;
		class1.templateMethod();
		class2.templateMethod();
	}
	
}
