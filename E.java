class E
{
  static int i=1000;
  static int j =2000;
  static void m1()  
  {
     int k=100;
     i=i+j;
     j=j+k;
     k=i+j;
     System.out.println(k);
  }
  static void m2()
  {
     int l=200;
     i=i+l;
     j=j+l;
     l=l+i+j;
     System.out.println(l);
  }
  static void display()
  {
    System.out.println(i);
    System.out.println(j);
  }
    public static void main(String[] args)
  {
    System.out.println(E.i);
    System.out.println(E.j);
    m1();
    m2();
    display();
  }
}
     
