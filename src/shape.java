public class shape {
    public void draw() {
        System.out.println("Drawing Shape");
    }

    void erase() {
        System.out.println("Erasing Shape");
    }
}
class display
{
    public static void main(String[] args) {
        shape obj1=new shape();
        obj1.erase();
        shape obj2=new shape();
        obj2.draw();
    }
}

