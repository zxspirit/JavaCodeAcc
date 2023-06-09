package designpattern.factory.simple;

/**
 * 操作类工厂类
 * 
 * @author liu yuning
 *
 */
public class OperationFactory {
    public static Operation createOperation(char operator) {
		return switch (operator) {
		case '+' -> new OperationAdd();
		case '-' -> new OperationSub();
		case '*' -> new OperationMul();
		case '/' -> new OperationDiv();
		default -> throw new RuntimeException("unsupported operation");
	};
    }
}