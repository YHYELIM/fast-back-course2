package course2_part2;

import model2.MathOperation;

public class LamdaExample {
    public static void main(String[] args) {
//        MathOperation add = (int x, int y) -> {
//            return x+y;
//        };
        //람다식 : 코드를 간결, 확장, 구현 쉬움
        MathOperation add = (x,y)-> x+y;
        MathOperation mul = (x,y)-> x*y;
        int result = add.operation(10,20);
        System.out.println(result);
        int mulresult = mul.operation(10,20);
        System.out.println(mulresult);




    }
}
