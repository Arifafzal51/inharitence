public class A
{
    showA()
    {
        System.out.println("a  class method");
    }


}
class B extends A
{
    void showB()
    {
        System.out.println("B class  method");
    }

    public static void main(String[] args)

    { A obj=new A();
        B ob1 = null;
        ob1.showA();
         //ob1.showB();
        B ob2=new B();
        ob2.showA();
        ob2.showB();

    }

    private void showA() {
    }
}