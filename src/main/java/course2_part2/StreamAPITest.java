package course2_part2;

import java.util.Arrays;

public class StreamAPITest {

    public static void main(String[] args) {
        //짝수 끼리 더해라
        int [] numbers = {1,2,3,4,5};
       int  sumOfEvens = Arrays.stream(numbers)
                        .filter(n->n%2==0) //람다식 : 짝수만 필터링
                        .sum();
        System.out.println("sumOfEvens = " + sumOfEvens);

        int [] arrayStrim = Arrays.stream(numbers)
                .filter(n-> n%2==0)
                .toArray();


        //결과 값을 배열로 뽑으려면 for문을 돌려서 받아야함
        for (int even : arrayStrim){
            System.out.println("even = " + even);
        }

    }
}
