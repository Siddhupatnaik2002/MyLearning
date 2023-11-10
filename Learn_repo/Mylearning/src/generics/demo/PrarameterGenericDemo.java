package generics.demo;

class ParameterDemo <K,V>{
	private K key;
	private V value;
	
	public ParameterDemo(K key, V value) {
		this.key = key;
		this.value=value;
	}
	
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		 return  "Data [key=" + key + " Value=" + value+ "]";
	}
	
	public <E,N> void display (E element , N number) {
		System.out.println("Element : "+ element +";number: "+number);
	}
}

public class PrarameterGenericDemo {
	public static void main(String[]arg) {
		ParameterDemo<Integer,String> pd = new ParameterDemo<Integer,String>(1,"Siddhu");
		System.out.println(pd.getKey());
		System.out.println(pd.getValue());
		
		pd.display("floatvalue",2.3f);
	}
}
