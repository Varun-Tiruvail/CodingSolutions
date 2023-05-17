import java.util.*;
public class Solution{
	static int maxProduct(int arr[]){
		int result = arr[0];
		int n = arr.length;
        int i = 0;
		while ( i < n){
			int mul = arr[i];
            int j = i + 1;
			while (j < n) {
				result = Math.max(result, mul);
				mul *= arr[j];
                j++;
			}
			result = Math.max(result, mul);
            i++;
		}
		return result;
	}
	public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int k = sc.nextInt();
        int[] arr = new int[k];
        int i = 0; 
        while(i<k){
            arr[i] = sc.nextInt();
            i++;
        }
        sc.close();
		System.out.println(maxProduct(arr));
	}
}