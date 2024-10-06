class D 
{
  static int a=1000;
  int b=2000;
  void display()
    {
      System.out.println(a);
      System.out.println(b);
    }
   static void modify()
     {
       a=a+100;
	System.out.println(a);
       
       
      }
  public static void main(String[] args)
     {
	System.out.println(D.a);
	D d1=new D();
	System.out.println(d1.b);
	d1.display();
	modify();
	
     }
}
	