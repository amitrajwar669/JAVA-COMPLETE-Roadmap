       ----->   // Inheritance//
      
      
       SINGLEINHERITANCE/////

class Animal
{
    void eat()
    {
        System.out.println("I Am Eating");
    }
}
class Dog extends Animal
{
    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.eat();
    }
    
}
    
          
class A
{
  void showA()
  {
    System.out.println("a class method");
  }
}
class B extends A
{
  void showB()
  {
    System.out.println("b class method");
  }
  public static void main(String[] aggs){
    A ob1=new A();
    ob1.showA();
    // ob1.showB();
    B ob2=new B();
    ob2.showB();
    ob2.showA();
  }
}
                       MULTILEVEL INH.....//
                     
class A
{
//   void showA()
//   {
//     System.out.println("a class method");
//   }
// }
// class B extends A
// {
//   void showB()
//   {
//     System.out.println("b class method");
//   }
  
// }
// class C extends B
// {
//   void showC()
//   {
//   System.out.println("c class method");
//   }
//   public static void main(String[] aggs){
//     A ob1=new A();
//     ob1.showA();
//     // ob1.showB();
//     B ob2=new B();
//     ob2.showA();
//     ob2.showB();
//     C ob3 = new C();
//     ob3.showA();
//     ob3.showB();
//     ob3.showC();
//   }
// }

      // ------>      // Hierarchical Inheritance/

// class A
// {
//   void showA()
//   {
//     System.out.println("a class method");
//   }
// }
// class B extends A
// {
//   void showB()
//   {
//     System.out.println("b class method");
//   }
  
// }
// class C extends A
// {
//   void showC()
//   {
//   System.out.println("c class method");
//   }
//   public static void main(String[] aggs){
//     A ob1=new A();
//     ob1.showA();
//     // ob1.showB();
//     B ob2=new B();
//     ob2.showA();
//     ob2.showB();
//     System.out.println("------------------------->");
//     C ob3 = new C();
//     ob3.showA();
//     // ob3.showB();
//     ob3.showC();
//   }
// }
