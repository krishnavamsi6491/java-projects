class C
{
 static int a=1000;
 static int b=2000;
 static void display()
 {
  System.out.println(a);
  System.out.println(b);
 }
 static void modify()
 {
  a=a+200;
  b=b-100;
 }
public static void main(String[] args)
	{
  	 display();
  	 modify();
  	 display();
	}
}