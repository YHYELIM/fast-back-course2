package course2_part2;

import model2.StringOperation;


public class LamdaApply {
    public static void main(String[] args) {
        StringOperation toUpperCase = s -> s.toUpperCase();
        StringOperation toLowerCase = s -> s.toLowerCase();

        String input = "Lamda Expressions";
        System.out.println(processString(input, toUpperCase));
        System.out.println(processString(input, toLowerCase));
        System.out.println(toUpperCase); // 참조 값
        System.out.println(toLowerCase); // 참조 값
    }
    public static String processString(String input, StringOperation operation){
        //1. input, 람다 표현식을 인자로 전달
        return operation.apply(input);
        //2. input 문자열 s에 전달, 람다 표현식 실행, s.toUpperCase(s.toLowerCase()) 실행 후 반환
        //3. processString 에 결과값 반환
    }
}

