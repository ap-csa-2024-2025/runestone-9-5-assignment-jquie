public class Main
{
    public static void main(String[] args)
    {
        Animal a = new Animal ("bob", "bird");
        Dog d = new Dog("bill", "pitbull");
        Cat c = new Cat("whiskers");
        
        a.matingCall();
        d.wagTail();
        System.out.println(c.getNumLives());

        d.matingCall();
        c.matingCall();

        Animal foo = new Dog("fido", "weiner");
        foo.matingCall();
        foo.wagTail();
    }
}