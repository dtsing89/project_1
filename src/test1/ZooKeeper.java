//package test1;
//import java.util.Random;
//
//public class ZooKeeper extends ZooEmployee {
//	
//	public ZooKeeper(String name) {
//		super(name,"zookeeper");
//	}
//
//	public void wakeAnimal(Animal animal) {
//		System.out.println(type + " wakes up " + animal.name + " the "+ animal.type);
//		animal.wakeUp();
//	}
//	public void callAnimal(Animal animal) {
//		System.out.println(type + " roll calls " + animal.name +  " the "+ animal.type);
//		animal.makeNoise();
//	}
//	public void feedAnimal(Animal animal) {
//		System.out.println(type + " feeds " + animal.name + " the "+ animal.type);
//		animal.eat();
//	}
//	public void exerciseAnimal(Animal animal) {
//		System.out.println(type + " exercises " + animal.name + " the "+ animal.type);
//		animal.roam();
//	}
//	public void sleepAnimal(Animal animal) {
//		System.out.println(type + " sleeps " + animal.name + " the "+ animal.type);
//		animal.sleep();
//	}
//	public void dig(Animal animal) {
//		System.out.println(type + " tried to wakes up " + animal.name + " the "+ animal.type + " but he dug instead." );
//	}
//  
//  public void charge(Animal animal) {
//		System.out.println(type + " tried to exercises " + animal.name + " the "+ animal.type + " but he charged instead." );
//	}
//  
//  public int rand(){
//  	 Random rand = new Random(); 
//     int random_1 = rand.nextInt(100); 
//     return random_1;
//	}
//
//}

package test1;
import java.util.Random;
import java.io.*;
import java.io.IOException;

public class ZooKeeper extends ZooEmployee {

	FileWriter writer = new FileWriter("dayatthezoo.out",true);
	
	public ZooKeeper(String name)throws IOException {
		super(name,"zookeeper");
	}

	public void wakeAnimal(Animal animal)throws IOException {
		FileWriter writer = new FileWriter("dayatthezoo.out",true);
		writer.write(type + " wakes up " + animal.name + " the "+ animal.type);
		writer.write("\n");
		animal.wakeUp();
		writer.close();
	
	}
	public void callAnimal(Animal animal)throws IOException {
		FileWriter writer = new FileWriter("dayatthezoo.out",true);
		writer.write(type + " roll calls " + animal.name +  " the "+ animal.type);
		writer.write("\n");
		animal.makeNoise();
		writer.close();
	}
	public void feedAnimal(Animal animal) throws IOException{
		FileWriter writer = new FileWriter("dayatthezoo.out",true);
		writer.write(type + " feeds " + animal.name + " the "+ animal.type);
		writer.write("\n");
		animal.eat();
		writer.close();
	}
	public void exerciseAnimal(Animal animal) throws IOException{
		FileWriter writer = new FileWriter("dayatthezoo.out",true);
		writer.write(type + " exercises " + animal.name + " the "+ animal.type);
		writer.write("\n");
		animal.roam();
		writer.close();
	}
	public void sleepAnimal(Animal animal)throws IOException {
		FileWriter writer = new FileWriter("dayatthezoo.out",true);
		writer.write(type + " sleeps " + animal.name + " the "+ animal.type);
		writer.write("\n");
		animal.sleep();
		writer.close();
	}
	public void dig(Animal animal) throws IOException{
		FileWriter writer = new FileWriter("dayatthezoo.out",true);
		writer.write(type + " tried to wakes up " + animal.name + " the "+ animal.type + " but he dug instead." );
		writer.write("\n");
		writer.close();
	}
  
	public void charge(Animal animal)throws IOException {
		FileWriter writer = new FileWriter("dayatthezoo.out",true);
		writer.write(type + " tried to exercises " + animal.name + " the "+ animal.type + " but he charged instead." );
		writer.write("\n");
		writer.close();
  	}
  
	public void arrive(int d) throws IOException {
  		FileWriter writer = new FileWriter("dayatthezoo.out",true);
  		writer.write("Zookeeper arrive at Zoo on Day " + d);
		writer.write("\n");
		writer.close();
  	}
  
  	public void leave(int d) throws IOException {
  		FileWriter writer = new FileWriter("dayatthezoo.out",true);
  		writer.write("Zookeeper leaves at Zoo on Day " + d);
		writer.write("\n");
		writer.close();
  	}
  
  	public int rand(){
	  Random rand = new Random(); 
	  int random_1 = rand.nextInt(100); 
	  return random_1;
  	}
  
}

