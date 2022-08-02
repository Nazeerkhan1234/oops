class Ab
{
	int x=10;
	void m1()
	{
		System.out.println("m1 in super class A");
	}
}

class Bc extends Ab
{
	void m2()
	{
		System.out.println("m2 in sub class B");
	}
}
class Cd extends Ab
{
	void m3()
	{
		System.out.println("m3 in sub class C");
	}
}
class Heirarchical
{
	public static void main(String s[])
	{
		Ab oa=new Ab();
		oa.m1();
		//oa.m2();
		
		Bc ob=new Bc();
		ob.m1();
		ob.m2();

		Cd oc=new Cd();
		oc.m1();
		//oc.m2();
		oc.m3();
	}
}

