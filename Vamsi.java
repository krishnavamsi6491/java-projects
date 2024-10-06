class Vamsi
{
  int p;
  int q;
   Vamsi(int i,int j)
   {
      p=i;
      q=j;
   }
  void display()
   {
    System.out.println(p);
    System.out.println(q); 
   }
  public static void main(String[] args)
   {
     Vamsi v1=new Vamsi(1000,2000);
     v1.display();
     Vamsi v2= new Vamsi(3000,4000);
     v2.display();
   }
}