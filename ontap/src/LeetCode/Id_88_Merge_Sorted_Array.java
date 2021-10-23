package LeetCode;

import java.util.Arrays;

public class Id_88_Merge_Sorted_Array {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0;i<nums2.length;i++){
            nums1[m++]=nums2[i];
        }
        Arrays.sort(nums1);
    }

    private static void Chen(int i, int[] nums1, int m) {
        boolean flag=false;
        for (int j = 0; j < m; j++) {
            if(nums1[j]>i){
                flag=true;
                for (int e=m-1;e>=j;e--){
                    nums1[e+1]=nums1[e];
                }
                nums1[j]=i;break;
            }
        }

        if (!flag){
            nums1[m]=i;
        }
    }

    public static void main(String[] args) {
        int nums1[]={4,0,0,0,0,0},m=1,nums2[]={1,2,3,5,6},n=5;
        merge(nums1,m,nums2,n);

        for (int i: nums1) {
            System.out.println(i);
        }
    }
}
