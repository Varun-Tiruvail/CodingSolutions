import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target){
        int i = 0;
        while (i < nums.length) {
            int j = i + 1;
            while (j < nums.length) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
                j++;
            }
            i++;
        }
        return new int[] {};
    }
    public void main(String[] args) {
        int[] nums = new int[10]; 
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0; 
        while(i < n) {
            nums[i] = sc.nextInt();
            i++;
        }
        int target = sc.nextInt();

        sc.close();

        int[] ind = twoSum(nums, target);

        if (ind.length == 2) {
            System.out.println(ind[0] + " " + ind[1]);
        } else {
            System.out.println("No solution found!");
        }
    }

}