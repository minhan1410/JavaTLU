package LeetCode;

public class Id_1295_Find_Numbers {
    public static int findNumbers(int[] nums) {
        int cout=0;
        for(int i=0;i<nums.length;i++){
            if((nums[i]+"").length() % 2==0){
                cout++;
            }
        }
        return cout;
    }

    public static void main(String[] args) {
        int a=findNumbers(new int[]{12,345,2,6,7896});
        System.out.println(a);
    }
}
