import java.util.*;
class GenericClass{
	public static void main(String[] args)
	{
		
		Test<Integer> iObj = new Test<Integer>(20);
		System.out.println("Integer value : " + iObj.getObject());

		Test<String> sObj = new Test<String>("Generic class");
		System.out.println("String value : " + sObj.getObject());
	}
}

class Test<T> {
	
	T obj;
	Test(T obj) 
	{ this.obj = obj; 
	} 
	public T getObject() { return this.obj; }
}