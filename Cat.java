public class Cat extends Animal
{
    private int numLives = 9;
    public Cat (String name)
    {
        super(name, "feline");
    }

    public int getNumLives()
    {
        return numLives;
    }

    public void matingCall()
    {
        System.out.println("meow");
    }

}