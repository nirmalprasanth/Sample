package Programs;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Duplicate {
	public static void main(String args[])
	{
		int a[]= {1,2,3,4,2,7,3,1,0};
		Map<Integer,Integer> m= new LinkedHashMap<Integer,Integer>();
		Set<Integer> s =new LinkedHashSet<>();
	
		for(int i=0;i<a.length;i++)
		{
			
		
			int n=1;
			if(m.containsKey(a[i]))
			{
				n=m.get(a[i])+1;
			}
			
				m.put(a[i], n);
			
		}
		Set<Entry<Integer, Integer>> entrySet = m.entrySet();
		for(Entry<Integer,Integer> x : entrySet )
		{
			System.out.println(x.getKey()+" "+x.getValue());
		}
		
	}

}
