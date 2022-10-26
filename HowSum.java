package DynamicProgramming;
import java.util.*;
public class HowSum {

	public static void main(String[] args) {
		int target=9000;		
		int [] arr= new int[] {1,2,3,4};		
		System.out.println(canSum(target,arr));//brute force
		System.out.println(" "+canSum(target,arr,new HashMap<>()));// memoization
	}
 
//brute force approach
	private static boolean canSum(int target, int[] arr) {
		if(target==0)return true;
		if(target<0)return false;
		for(int i:arr) {
			if(canSum(target-i,arr)==true)return true; //array elements times calling that function 
		}
		return false;
	}
	
	// MEMOIZATION approach
	  private static boolean canSum(int target, int[] arr, Map <Integer,Boolean> map) {
		  if(map.containsKey(target))return map.get(target);
		  if(target==0)return true;
			if(target<0)return false;
			for(int i:arr) {
				if(canSum(target-i,arr)==true) {
					map.put(target, true);
					return true;
				}
			}
			map.put(target, false);
			return map.get(target);
		}
}
