package model2;

@FunctionalInterface
public interface StringOperation {
    //입력된 문자열 s 반환하는 추상메서드식
    public String apply (String s);
}
