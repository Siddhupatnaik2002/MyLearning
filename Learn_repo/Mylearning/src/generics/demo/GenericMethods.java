package generics.demo;
import java.util.*;
public class GenericMethods {
	
	public <E> void printList(List<E> l) {
		for(E e : l) {
			System.out.println(e);
		}
	}
	
	public static void main(String[]arg) {
		List <Integer> l1 = new ArrayList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		System.out.println("********************");
		System.out.println("Integer ArrayList:");
		System.out.println();
		new GenericMethods().printList(l1);
		System.out.println();
		System.out.println("********************");
		List <String> l2 = new ArrayList<>();
		l2.add("Luffy");
		l2.add("Zoro");
		l2.add("Sanji");
		System.out.println("String ArrayList:");
		System.out.println();
		new GenericMethods().printList(l2);
		System.out.println();
		System.out.println("********************");
		
		
	}

}
