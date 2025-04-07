public class Animal
{
  private String name;
  private String species;

  public Animal(String name, String species)
  {
    this.name = name;
    this.species = species;
  }  

  public void matingCall()
  {
    System.out.println("generic sound");
  }

  public String toString()
  {
    return "A " + species + " named " + name;
  }

}