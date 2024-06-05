package com.encapsulation;

public class Addition {
int number1;
int number2;

public Addition(int number1, int number2) {
	this.number1 =number1;
	this.number2 = number2;
}

public  Addition () {}
public int getNumber1() {
	return number1;
}

public void setNumber1(int number1) {
	if(number1>0)
	this.number1 = number1;
}

public int getNumber2() {
	return number2;
}

public void setNumber2(int number2) {
	if(number2>0)
	this.number2 = number2;
	

}

public void addTwoNumber () {
 //	System.out.print("Addition of number is: ");
	System.out.println(number1+number2);
}

@Override
public String toString() {
	return "Addition [number1 =" + number1 + " , number2=" + number2 + "]";
}
}