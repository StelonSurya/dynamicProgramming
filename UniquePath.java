package DynamicProgramming;
import java.util.*;
public class UniquePath {

	public static void main(String[] args) {
		//grid size a X b
		int a=12;
		int b=12;
		System.out.println(find(a,b,new HashMap<>()));
	}

	private static int find(int a, int b, Map<String, Integer> map) {
		String s=a+","+b;
		if(map.containsKey(s))return map.get(s);
		if(a==1 || b==1)return 1;
		map.put(s, find(a-1,b,map)+find(a,b-1,map));
		return map.get(a+","+b);
	}

}
