import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringMapPutGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x="KASAAR";
		char y[]=x.toCharArray();
		int size=y.length;
		int i=0;
		Map<Character,Integer>map=new HashMap();
		
		while(i!=size) {
			if(map.containsKey(y[i])==false) {
				map.put(y[i], 1);
				i++;
			}
			else {
				int oldVal=map.get(y[i]);
				int newVal=oldVal+1;
				map.put(y[i], newVal);
				i++;
			}
		}
		
		Set<Map.Entry<Character,Integer>>hmap=map.entrySet();
		for(Map.Entry<Character,Integer>data:hmap) {
			System.out.print(data.getKey());
			System.out.println(data.getValue());
			
		}

	}

}
