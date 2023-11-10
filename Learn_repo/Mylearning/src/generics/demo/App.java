package generics.demo;

import java.util.*;

class Data <T>{
	private T variable;
	
	public Data(T variable) {
		this.variable=variable;
	}
	
	public T getVariable() {
		return variable;
	}

	@Override
	public String toString() {
		return "Data [variable=" + variable + "]";
	}
	
	
}

public class App {
	public static  void main(String []arg) {
//		List <Object> l1 = new LinkedList<>();
//		l1.add("Hello");sqdasdas
//		l1.add(23.4f);
//		l1.add('&');
//		l1.add(21);
//		
//		for(Object o : l1) {
//			System.out.println(o);
//		}
		
		//Data <Object> d = new Data <Object>("String");
		//System.out.println(d.toString());
		
		List<Data<Object>> l2 = new LinkedList<>();
		l2.add(new Data<Object>("Hello"));
		l2.add(new Data<Object>(2));
		l2.add(new Data<Object>(34.4f));
		l2.add(new Data<Object>('^'));
		new App().print(l2);
		
	}
	
	
	public void print(List<Data<Object>>l) {
		ListIterator<Data<Object>> i =  l.listIterator();
		while(i.hasNext()) {
			System.out.println("element: "+i.next().getVariable());
		}
		
	}
	
}
