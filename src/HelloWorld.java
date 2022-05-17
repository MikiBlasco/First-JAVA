import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collector;

public class HelloWorld {
    public static void main(String[] args) {

        System.out.println(" Array normal ");

        int[] nums = {1, 2, 3, 4, 5};
        for (int i: nums) {
            System.out.println(nums[i-1]);
        }

        System.out.println(" Array multiplied ");

        int[] multiplied = multiply(nums);
        for (int i: multiplied) {
            System.out.println(multiplied[i]);
        }
        System.out.println(" Array reverse ");
         int[] reversed = convert(nums);
         for (int i: nums) {
            System.out.println(nums[i]);
        }

        System.out.println(" ArrayList normal ");

        ArrayList a = new ArrayList();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);

        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i-1));
        }

        System.out.println(" ArrayList reverse  ");

        Collections.reverse(a);

        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }

    }
        public static int[] convert( int[] nums){

            int[] newArray = new int[nums.length];

            for (int i = 0; i < nums.length; i++) {
                newArray[i] = nums[nums.length - 1 - i];
            }
            nums = newArray;

            return newArray;
        }

        public static int[] multiply( int[] nums){
            int firstNum = nums[0];
            int[] multiplied = new int [nums.length];
            for (int z = 0; z < nums.length; z++) {
                if (z == nums.length) {
                    multiplied[z] = nums[z] * firstNum;
                }else
                    multiplied[z] = nums[z] * nums[z + 1];

            }
            return multiplied;
        }
    }


