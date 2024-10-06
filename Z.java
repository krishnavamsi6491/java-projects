class A
{
 void m1()
{
 System.out.println("in m1 of A");
}
 void m2()
{ 
System.out.println("in m2 of A");
}
}
class B extends A
{
 void m3()
 {
  System.out.println("in m3 of B");
 }
 void m2()
{
 System.out.println("in m2 of B");
}
}
class Test extends A,B
{ 
public static void main(String[] args)
{
 B b1=new B();
 b1.m1();
 b1.m2();
 b1.m3();
 A a1=new A();
 a1.m1();
 a1.m2();
}
}
 