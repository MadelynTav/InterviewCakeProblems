package nyc.c4q.madelyntav.src.com.company;
import java.util.Arrays;

/**
 * Created by c4q-madelyntavarez on 11/16/15.
 */
public class DataRep
{

    public static void main(String[] args)
    {
        int num=567;

//        printBitString(num);
//        printBitString(200);
//        System.out.println(printBitString(0));
//        printBitString(5);
//        printBitString(10);
        System.out.println(printPalindrome(5));
        System.out.println(printPalindrome(num));
        System.out.println(printPalindrome(10));
        System.out.println(printPalindrome(0));
       // System.out.println(printOnesInBitString(num));
       // System.out.println(printPalindrome(num));
    }

    private static boolean printPalindrome(int num)
    {
        char [] nums= printBitString(num);
        int end= nums.length-1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[end]){
                return false;
            } else{
                end--;
            }
        }
        return true;
    }

    private static String printOnesInBitString(int num)
    {

        char [] numToRef= printBitString(num);
        String newNum="";

        for(int i=0;i<numToRef.length;i++){
            if(numToRef[i]=='1'){
                newNum+=1;
            }
        }
        return  newNum;
    }

    private static char [] printBitString(int num)
    {

        if(num<=0){
            return new char[0];
        }
        String binary="";

        while(num>0){
            if(num % 2 ==0){
                binary+=0;
            } else{
                binary+=1;
            }
            num=num/2;
        }

        char [] nums=binary.toCharArray();
        int end= nums.length-1;

            for(int i = 0; i <= nums.length / 2-1; i++)
            {
                char hold = nums[i];
                nums[i] = nums[end];
                nums[end] = hold;
                end--;
            }
        //System.out.println(nums);
        return nums;
    }
}
