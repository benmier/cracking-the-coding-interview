import java.util.*;

public class AnimalShelter{

	public static void main(String [] args){
		Shelter shelter = new Shelter();
		shelter.enqueue("cat","Sohpie");
		shelter.enqueue("cat","Cow");
		shelter.enqueue("cat","Joe");
		shelter.enqueue("cat","Ivan");
		shelter.enqueue("dog","Bill");
		shelter.enqueue("dog","Callie");
		shelter.enqueue("dog","Ben");
		shelter.enqueue("dog","Luca");
		System.out.println(shelter.dequeueAny());
		System.out.println(shelter.dequeueDog());
		System.out.println(shelter.dequeueCat());
	}
}

class Shelter{
	LinkedList cats = new LinkedList();
	LinkedList dogs = new LinkedList();

	void enqueue(String animal, String name){
		if(animal=="Cat" || animal=="cat"){
			cats.add(name);
			System.out.println("New Cat: "+cats.peekLast());
		}
		else if(animal=="Dog" || animal=="dog"){
			dogs.add(name);
			System.out.println("New Dog: "+dogs.peekLast());
		}
		else
			System.out.println("Error: Unknown animal");
	}

	String dequeueAny(){
		if(Math.random()<0.5)
			return cats.removeFirst().toString();
		else
			return dogs.removeFirst().toString();
	}

	String dequeueDog(){
		return dogs.removeFirst().toString();
	}

	String dequeueCat(){
		return cats.removeFirst().toString();
	}
}