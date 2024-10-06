class B
{
  int a=100;
  int b=200;
  void display()
  {
     System.out.println(a);
     System.out.println(b);
  }
  void modify()
  {
    a=a+100;
    b=b+100;
  }
   public static void main(String[] args)
    {
        B b1=new B();
        b1.display();
	b1.modify();
        b1.display();
    }
}