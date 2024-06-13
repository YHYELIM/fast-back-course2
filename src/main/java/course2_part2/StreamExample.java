package course2_part2;

import model.IntArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamExample {
    public static boolean isEven(int number){
        return number%2==0;
    }
    public static void main(String[] args) {
        List<Integer>  numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Predicate<Integer> isEven = n->n%2==0;
        int sumOfSquares = numbers.stream()
                .filter(StreamExample::isEven) //짝수 필터링 //메소드를 이용해서 참조방식도 가능
                .sorted()// 정렬
                .map(n->n*n) //원소들 제곱
                .reduce(0,Integer::sum); //원소들
        System.out.println("sumOfSquares =" + sumOfSquares);
    }
}
