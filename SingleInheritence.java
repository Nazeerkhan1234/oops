class A
{
	int x=10;
	void m1()
	{
		System.out.println("m1 in super class A");
	}
}

class B extends A
{
	void m2()
	{
		System.out.println("m2 in sub class B");
	}
}
class SingleInheritence
{
	public static void main(String s[])
	{
		A oa=new A();
		oa.m1();
//		oa.m2();// Compilation Problem
		
		B ob=new B();
		ob.m1();
		ob.m2();
	}

}
