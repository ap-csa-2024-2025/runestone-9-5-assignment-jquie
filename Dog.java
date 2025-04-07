public class Dog extends Animal
{
    private String breed;
    public Dog(String name, String breed)
    {
        super(name,"canine");
        this.breed = breed;

    }

    public String getbreed()
    {
        return breed;
    }

    public void wagTail()
    {
        System.out.println("waggin");
    }

    public void matingCall()
    {
        System.out.println("woof");
    }
}