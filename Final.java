class Final
{
 void m1()
 {
  System.out.println("in m1 of final");
 }
 void m2()
 {
  System.out.println("in m2 of final");
 }
}
class B extends Final
{
 void m3()
 {
  System.out.println("in m3 of B");
 }
}
class Test
{
 public static void main(String[] args)
 {
  B b1=new B();
  b1.m1();
  b1.m2();
  b1.m3();
  Final f1=new Final();
  f1.m1();
  f1.m2();
 }
}
 
