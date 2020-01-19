import java.util.HashMap;

public class HashMapCalculator {
	public int commonKeyValuePairs(HashMap<String, String> a, HashMap<String, String> b){
		int c = 0;
		
		for(String s : a.keySet()) {
			for(String t : b.keySet()) {
				if((s.equalsIgnoreCase(t))&&(a.get(s).equalsIgnoreCase(b.get(t))))
					c++;
			}
		}
		
		
		return c;
	}
}
