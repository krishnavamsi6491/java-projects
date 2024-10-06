class H
{ 
  void m1()
    {
	System.out.println("in no param of m1");
    }
  void m1(int j,int l)
    {
	System.out.println("in int,int param of m1");
    }
  void m1(double k,float n)
    {
	System.out.println("in double,float param of m1");
    }
  void m1(float i)
    {
        System.out.println("in float param of m1");
    }
  
public static void main(String[] args)
    {
	H h1=new H();
	h1.m1();
 	h1.m1(123.456f);
	h1.m1(100,200);
	h1.m1(123.447,123.789f);
	
    }
}
