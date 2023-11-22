import java.util.HashMap;


public class HashMapExample{

  public static void main(String[] args)
	{
		HashMap<String, Integer> map = new HashMap<>();

		map.put("shreya", 10);
		map.put("naman", 30);
		map.put("leana", 20);

		
		System.out.println("Size of map is:- "
						+ map.size());

		System.out.println(map);

	
		
	}
}
