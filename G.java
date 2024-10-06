class G
{
   static int i=1000;
   int j=2000;
   static void m1()
	{
	   int p=100;
	   i=i+p;
	   p=p+i;
	   System.out.println(p);
        }
   void m2()
  	{
	   int q=200;
	   i=i+q;
	   j=j+q;
	   q=q+i+j;
	System.out.println(q);
        }
   void m3()
	{
	   int r=300;
	   i=i+j;
	   j=j+r;
	   r=r+i+j;
	 System.out.println(r);
	}
   void display()
	{
	   System.out.println(i);
	   System.out.println(j);
	}
  public static void main(String[] args)
        {
	  System.out.println(G.i);
 	  G g1=new G();
	  System.out.println(g1.j);
	  m1();
	  g1.m2();
          g1.m3();
	  g1.display();
	}
}
	  
	  