public class shape {
   static public void draw() {
        System.out.println("Drawing Shape");
    }

    void erase() {
        System.out.println("Erasing Shape");
    }
}
class dislay
{
    public static void main(String[] args) {
        shape obj1=new shape();
        obj1.erase();
       // shape.erase();
        shape.draw();
    }
}

