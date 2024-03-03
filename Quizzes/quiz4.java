public class quiz4 {
    public static void main(String[] args) 
    {
       A a = new B();
        a.m1();
      }
    }
public class A 
    {
   private int x = 50;	
   void m1() {
       System.out.println(x);	 
}
}
public class B extends A {

}

