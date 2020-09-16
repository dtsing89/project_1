package test1;

import java.util.Scanner;
import java.io.*;
import java.io.FileWriter;
import java.io.IOException;

public class Zoo {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount of days");
		String dayString = input.nextLine();
		int days = Integer.parseInt(dayString);

		ZooKeeper zookeeper = new ZooKeeper("David");

		Cat cat = new Cat("Charlie");
		Tiger tiger = new Tiger("Tom");
		Dog dog = new Dog("Dug");
		Wolf wolf = new Wolf("Wendy");
		Lizard lizard = new Lizard("Lilly");
		Snake snake = new Snake("Sam");
		Hippo hippo = new Hippo("Harry");
		Rhino rhino = new Rhino("Rick");

		for (int i = 0; i < days; i++) {
			System.out.println("Zookeeper arrives at Zoo on Day " + days);
			int random = zookeeper.rand();

			zookeeper.arrive(i+1);
			
			zookeeper.wakeAnimal(cat);
			zookeeper.wakeAnimal(tiger);
			zookeeper.wakeAnimal(dog);
			zookeeper.wakeAnimal(wolf);
			zookeeper.wakeAnimal(lizard);
			zookeeper.wakeAnimal(snake);
			zookeeper.wakeAnimal(hippo);
			zookeeper.wakeAnimal(rhino);

			zookeeper.callAnimal(cat);
			zookeeper.callAnimal(tiger);
			zookeeper.callAnimal(dog);
			zookeeper.callAnimal(wolf);
			zookeeper.callAnimal(lizard);
			zookeeper.callAnimal(snake);
			zookeeper.callAnimal(hippo);
			zookeeper.callAnimal(rhino);

			zookeeper.feedAnimal(cat);
			zookeeper.feedAnimal(tiger);
			zookeeper.feedAnimal(dog);
			zookeeper.feedAnimal(wolf);
			zookeeper.feedAnimal(lizard);
			zookeeper.feedAnimal(snake);
			zookeeper.feedAnimal(hippo);
			zookeeper.feedAnimal(rhino);

			zookeeper.exerciseAnimal(cat);
			zookeeper.exerciseAnimal(tiger);
			if (random > 25) {
				zookeeper.exerciseAnimal(dog);
			} else {
				zookeeper.dig(dog);
			}
			zookeeper.exerciseAnimal(wolf);
			zookeeper.exerciseAnimal(lizard);
			zookeeper.exerciseAnimal(snake);

			if (random > 25) {
				zookeeper.exerciseAnimal(hippo);
			} else {
				zookeeper.charge(hippo);
			}

			if (random > 25) {
				zookeeper.exerciseAnimal(rhino);
			} else {
				zookeeper.charge(rhino);
			}

			//////

			random = zookeeper.rand();

			if (random <= 30) {
				zookeeper.exerciseAnimal(cat);
			} else if (random > 30 && random <= 60) {
				zookeeper.callAnimal(cat);
			} else {
				zookeeper.sleepAnimal(cat);
			}

			//////

			random = zookeeper.rand();

			if (random <= 30) {
				zookeeper.exerciseAnimal(tiger);
			} else if (random > 30 && random <= 60) {
				zookeeper.callAnimal(tiger);
			} else {
				zookeeper.sleepAnimal(tiger);
			}

			zookeeper.sleepAnimal(dog);
			zookeeper.sleepAnimal(wolf);
			zookeeper.sleepAnimal(lizard);
			zookeeper.sleepAnimal(snake);
			zookeeper.sleepAnimal(hippo);
			zookeeper.sleepAnimal(rhino);
			zookeeper.leave(i+1);

		}

	}
	
}
