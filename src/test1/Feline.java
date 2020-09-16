package test1;


public abstract class Feline extends Animal
{
    public Feline(String name, String type)
    {
        super(name,type); // this calls Animal(name)
    }
}
