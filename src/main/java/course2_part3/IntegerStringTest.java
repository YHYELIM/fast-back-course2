package course2_part3;

public class IntegerStringTest {
    public static void main(String[] args) {
        String str1 = "123";
        String str2 = "123";
        System.out.println(str1 + str2); // 문자열끼리 결합

      int num  =  Integer.parseInt(str1) + Integer.parseInt(str2);
        System.out.println(num); //246

        int su1 = 123;
        int su2 = 123;
        System.out.println(su1 + su2); // 덧셈

        String str = String.valueOf(su1) + String.valueOf(su2);
        System.out.println(str);//"123123"

    }
}
