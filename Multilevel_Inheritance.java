
class E
{
	int x=10;
	void m1()
	{
		System.out.println("m1 in super class E");
	}
}

class F extends E
{
	void m2()
	{
		System.out.println("m2 in sub class F");
	}
}
class G extends F
{
	void m3()
	{
		System.out.println("m3 in sub class G");
	}
}
class Multilevel_Inheritance
{
	public static void main(String s[])
	{
		E oa=new E();
		oa.m1();
		//oa.m2();
		
		F ob=new F();
		ob.m1();
		ob.m2();

		G oc=new G();
		oc.m1();
		oc.m2();
		oc.m3();
	}
}