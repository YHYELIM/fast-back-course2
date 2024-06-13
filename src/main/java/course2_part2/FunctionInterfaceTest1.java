package course2_part2;

import model2.MathOperation;
import model2.MathOperationImpl;

public class FunctionInterfaceTest1 {
    public static void main(String[] args) {
        MathOperation mo = new MathOperationImpl();
        int result = mo.operation(10,20);
        System.out.println("test1 : " + result);
    }
}
