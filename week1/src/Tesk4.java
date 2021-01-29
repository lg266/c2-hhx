import java.util.Arrays;

public class Tesk4 {
    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        int zeroNum=0;
        System.out.println("输入:"+ Arrays.toString(nums));
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeroNum++;
            }else if(zeroNum!=0){
                nums[i-zeroNum]=nums[i];
                nums[i]=0;
            }
        }
        System.out.println("输出:"+Arrays.toString(nums));
    }
}
