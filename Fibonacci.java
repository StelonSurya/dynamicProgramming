package DynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

	public static void main(String[] args) {
		int n=100;
		System.out.println(fibo(n,new HashMap<>()));
		// that map is known as memoization 
	}

	private static long fibo(long n, Map<Long,Long> map) {
		if(map.containsKey(n))return map.get(n); // if already exist return that value && avoiding duplicate [stack calls]
		if(n<=2)return 1;
		map.put(n,fibo(n-1,map)+fibo(n-2,map));
		return map.get(n);
	}

}
