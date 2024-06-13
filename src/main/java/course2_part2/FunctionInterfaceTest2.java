package course2_part2;

import model2.MathOperation;
//MathOperation 인터페이스를 내부 익명 클래스로 구현해보자
public class FunctionInterfaceTest2 {

    public static void main(String[] args) {

        // MathOperation mo = new MathOperation(); -> 인터페이스는 객체를 만들 수 없음
        MathOperation mo = new MathOperation(){
            //인터페이스는 존재하지만 구현 클래스는 존재하지 않음
            @Override
            public int operation(int x, int y) {
                return x+y;
            }
        };
        int result = mo.operation(10,20);
        System.out.println("result : " + result);
    }



}
