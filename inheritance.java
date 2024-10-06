class inheritance
{
 void m1()
 {
  System.out.println("in m1 of inheritance");
 }
void m2()
 {
  System.out.println("in m2 of inheritance");
 }
}
class B extends inheritance
{
 void m3()
 {
  System.out.println("in m3 of B");
 }
 void m4()
 {
  System.out.println("in m4 of B");
 }
}
class C extends B
{
 void m5()
 {
  System.out.println("in m5 of C");
 }
 void m6()
 {
  System.out.println("in m6 of C");
 }
}
class Test
{
  public static void main(String[] args)
  { 
   C c1=new C();
   c1.m1();
   c1.m2();
   c1.m3();
   c1.m4();
   c1.m5();
   c1.m6();
   
  }
}
