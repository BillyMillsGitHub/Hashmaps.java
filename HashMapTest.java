package PractiseProjects;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapTest {







	public static void main(String[] args) {

		Map<String, String> capitalCities = new HashMap<>();

		capitalCities.put("England", "London");
		capitalCities.put("Russia", "Moscow");
		capitalCities.put("Japan", "Tokyo");
		System.out.println(capitalCities.size());
		System.out.println(capitalCities.get("Russia"));

      capitalCities.remove("England");
      capitalCities.clear();
		

		for (String i : capitalCities.keySet()) {
			System.out.println(i);
		}
		for (String i : capitalCities.values()) {
			System.out.println(i);
		}
		
		Map<String, Integer> people = new HashMap<>();

      people.put("Billy", 28);
      people.put("Dave", 24);
      people.put("Jimmy", 88);

      for (Entry<String, Integer> i : people.entrySet()) {
          System.out.println(i);
      }

	}
}