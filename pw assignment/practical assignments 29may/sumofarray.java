public class sumofarray {
    public static void main(String[] args) {
        int nums[]={5,6,7,2,1};
        int sum=0;

        for(int i=0;i<nums.length;i++)
        sum=sum+nums[i];

        System.out.println("sum of all the elements is :" + sum);
    }
}
