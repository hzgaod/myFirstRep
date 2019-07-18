import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class 你所了解的HashMap {

	public static void main(String[] args) {
		Map<String,Object> map=new HashMap<>();
		System.out.println(map.put("1", "a"));
		map.put("2", "b");
		map.put("3", "c");
		map.put("4", "d");
		System.out.println(map.put("1", "abc"));
		Set<Map.Entry<String,Object>>set= map.entrySet();
		Iterator<Map.Entry<String,Object>> it=set.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next().getKey());
		}
		

	}
}
