package test1;

public class Animal
{
    String name;
    String type;

    //Use of encapsulation
    public Animal(String name, String type)
    {
        this.name = name;
        this.type = type;
    }

    public void sleep(){
    	System.out.println(name + "  the " + type + " sleeps.");
    }
    public void makeNoise() {
    	System.out.println(name + "  the " + type + " makes noise.");
    }
    public void wakeUp() {
    	System.out.println(name + "  the " + type + " wakes up.");
    }
    public void eat() {
    	System.out.println(name + "  the " + type + " eats.");
    }
    public void roam() {
    	System.out.println(name + "  the " + type + " roams.");
    }

  
}


//wake up, make noise, eat, roam, and sleep.



