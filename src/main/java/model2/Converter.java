package model2;
@FunctionalInterface
public interface Converter<F,T> {
    T convert (F from);
    //F를 T로 반환
    //F : 반환 전 타입
    //T : 반환 후 타입

}
