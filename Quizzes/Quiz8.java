public class Quiz8 {

}
// class A
// {
//     String s = "AAA";
//     void methodA()
//     {
//         System.out.println(s);
//     }
//     static class B
//     {
//         void methodB()
//         {
//             methodA();
//         }
//     }
// }   
class A
{
    class B
    {
        static void methodB()
        {
            System.out.println("Method B");
        }
    }
}