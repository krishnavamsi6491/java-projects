class J
{
  String cbname;
  String cname;
  String cadd;
  int cacno;
  double cbal;
  J(String cbname,String cname,String cadd,int cacno,double cbal)
   {
      this.cbname=cbname;
      this.cname=cname;
      this.cadd=cadd;
      this.cacno=cacno;
      this.cbal=cbal;
   }
   void deposit(double damt)
    {
      cbal=cbal+damt;
    }
    void withdraw(double wamt)
    {
      cbal=cbal-wamt;
    }
    void display()
    {
      System.out.println(cbname);
      System.out.println(cname);
      System.out.println(cadd);
      System.out.println(cacno);
      System.out.println(cbal);
    }
  public static void main(String[] args)
     {
        J j1=new J("sbi","vamsi","India","57657","100000.00");
        j1.deposit(1000);
        j1.withdraw(46678);
        j1.display();
     }
}
