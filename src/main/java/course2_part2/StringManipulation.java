package course2_part2;

public class StringManipulation {


    public static void main(String[] args) {

        //HelloWorld 라는 문자열을 생성
        String str = "HelloWorld";
        System.out.println(str.charAt(1));
        System.out.println(str.replaceAll("o", "x"));
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(5)); //World
        System.out.println(str.substring(5,8));//Wor
        System.out.println(str.indexOf("Wor"));//5 못찾으면 -1 리턴

        for (int i =0 ; i<str.length(); i++){
            System.out.println(str.charAt(i));
        }

    }


}
