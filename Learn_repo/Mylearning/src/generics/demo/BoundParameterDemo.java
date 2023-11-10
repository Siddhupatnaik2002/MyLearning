package generics.demo;

 class BoundParameter<K extends Integer, V extends Demo> {
	private K key;
	private V val;
	
	public BoundParameter(K key,V val) {
		this.key=key;
		this.val=val;
	}
	
	public K getKey() {
		return key;
	}
	public V getVal(){
		return val;
	}
	public <E extends Character,N extends Number> void info(E ele, N num) {
		System.out.println("Element: "+ele+ ";Number: "+num);
	}
}

class Demo{
	public void display() {
		System.out.println("Hello Siddhu");
	}
}

public class BoundParameterDemo {
	public static void main(String arg[]) {
		
		BoundParameter <Integer,Demo> bp = new BoundParameter<Integer,Demo>(1,new Demo());
		
		System.out.println(bp.getKey());
		bp.getVal().display();
		bp.info('A', 3.2f);
		
		
		
	}
}
