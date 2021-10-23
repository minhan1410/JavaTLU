package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Id_27_Remove_Element {
    public static int removeElement(int[] nums, int val) {
//        List<Integer> arrays=new ArrayList<Integer>();
//
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i]!=val){
//                arrays.add(nums[i]);
//            }
//        }
//
//        for (int i = 0; i < arrays.size(); i++) {
//            nums[i]=arrays.get(i);
//        }
//        for (int i = arrays.size(); i < nums.length ; i++) {
//            nums[i]=0;
//        }
//
//        return arrays.size();
        int k=0;
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int nums[]=new int[]{0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums,2));

        for (int i:nums) {
            System.out.print(i+", ");
        }
    }
}
