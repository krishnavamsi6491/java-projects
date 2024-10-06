class constructor
{
  constructor()
  {
   System.out.println("in constructor of constructor");
  }
}
class N extends constructor
{
 N()
 {
   System.out.println("in constructor of N");
 }
}
class Test extends  constructor,N
{
public static void main(String[] args)
{
 N n1=new N();
 constructor c1=new constructor();
 }
}

// Source code is decompiled from a .class file using FernFlower decompiler.