import java.util.*;

public class AnimalShelter{

	public static void main(String [] args){
		Shelter shelter = new Shelter();
		shelter.enqueue("cat","Sohpie");
		shelter.enqueue("dog","Callie");
		System.out.println(shelter.dequeueAny());
	}
}

class Shelter{
	LinkedList cats = new LinkedList();
	LinkedList dogs = new LinkedList();

	void enqueue(String animal, String name){
		if(animal=="Cat" || animal=="cat"){
			cats.add(name);
			System.out.println("New Cat: "+cats.peek());
		}
		else if(animal=="Dog" || animal=="dog"){
			dogs.add(name);
			System.out.println("New Dog: "+dogs.peek());
		}
		else
			System.out.println("Error: Unknown animal");
	}

	Object dequeueAny(){
		double random = Math.random();
		if(random<0.5)
			return cats.removeFirst();
		else
			return dogs.removeFirst();
	}

}