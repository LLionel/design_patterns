package cn.Lionel.template;

public abstract class AbstractClass {

	protected abstract void methodA();
	protected abstract void methodB();
	protected abstract void methodC();
	protected void templateMethod()
	{
		methodA() ;
		methodB() ;
		methodC() ;
	}
}
