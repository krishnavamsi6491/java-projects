class F
{
  int i=1000;
  int j=2000;
  void m1()
	{ 
	  int a=100;
	  i=a+j;
	  j=j+i;
    	  a=i+j+a;
	  System.out.println(a);
        }
  void m2()
	{
	   int b=200;
	   i=b+j;
	   j=i+b;
           b=b+i+j;
           System.out.println(b);
        }
  void display()
       {
	  System.out.println(i);
	  System.out.println(j);
        }
  public static void main(String[] args)
      {
         F f1=new F();
	 System.out.println(f1.i);
	 System.out.println(f1.j);
	 f1.m1();
	 f1.m2();
	 f1.display();
      }
}
	
