class V
{
    void m1()
  {
    System.out.println("in m1 of V");
  }
    void m2()
  {
    System.out.println("in m2 of V");
  }
}
class K extends V
{
   void m3()
  {
    System.out.println("in m3 of K");
  }
   void m4()
  {
    System.out.println("in m4 of K");
  }
}
class G extends K
{
   void m5()
  {
    System.out.println("in m5 of G");
  }
  void m6()
  {
    System.out.println("in m6 of G");
  }
}
public static void main(String[] args)
  {
    G g1=new G();
    System.out.println(g1);
    g1.m1();
    g1.m2();
    g1.m3();
    g1.m4();
    g1.m5();
    g1.m6();
   K k1=new K();
   System.out.println(k1);
   k1.m1();
   k1.m2();
   k1.m3();
   k1.m4();
   V v1=new V();
   System.out.println(v1);
   v1.m1();
   v1.m2(); 
 }


  