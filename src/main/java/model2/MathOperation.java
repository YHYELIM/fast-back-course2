package model2;
@FunctionalInterface // 함수형 인터페이스 : 하나의 추상 메서드만 가짐
public interface MathOperation {
    public int operation(int x, int y); //추상메서드
}
