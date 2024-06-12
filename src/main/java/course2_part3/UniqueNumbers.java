package course2_part3;

import java.util.HashSet;
import java.util.Set;

public class UniqueNumbers {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7,1,3};

        Set<Integer> UniqueNums  = new HashSet<>();
        for (int number : nums){
            System.out.println(number);
        }

        System.out.println("Unique numbers.....");
        for (int number : UniqueNums){
            System.out.println(number);
        }


    }
}
