package models;

public class Calculator {
	public double operandOne;
	public double operandTwo;
	public boolean add = false;
	
	public Calculator() {}
	public Calculator(double operandOne, double operandTwo, boolean add) {
		this.setOperandOne(operandOne);
		this.setOperandTwo(operandTwo);
		this.setOperation(add);
		
	}
	public void performOperation(double operandOne, double operandTwo, boolean add) {
		setOperation(add);
		if (add == false) {
//			operandOne -= operandTwo;
			System.out.println(operandOne -= operandTwo);
		}
		else {
			System.out.println(operandOne += operandTwo);
		}
		
		
	}
	public double getResults() {
		
		return double;
	}
	public double setOperandOne(double number) {
		this.operandOne = number;
		return operandOne;
	}
	public boolean setOperation(boolean add) {
		if(add != false) {
			return true;
		}else {
			return false;
		}
	}
	public double setOperandTwo(double number) {
		this.operandTwo = number;
		return operandTwo;
	}
}

