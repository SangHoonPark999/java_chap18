package kh.lambda;

import java.util.Scanner;

public class LambdaMain {

	public static void main(String[] args) {
		//임시객체부 = new 자식()
		//입력, 출력 없다=>람다식
		//자식임시객체 자식이 부모를 오버라이딩
		A a = ()-> System.out.println("입력없고, 리턴없다");
		
		//부모 추상메소드를 불러주면 -> 자식의 오버라이딩 함수가 작동이 된다.
		a.method();
		System.out.println("=========================");
		
		D d = (c, b)-> c+b;
		double value = d.methodD(10, 20.5);
		System.out.printf("d.methodD(10, 20.5) = %.2f", value);
		
		System.out.println("=========================");
		
		B b = (name)->{
				Scanner scan = new Scanner(System.in);
				System.out.printf("당신의 %s 입력해줏요", name);
				int value1 = Integer.parseInt(scan.nextLine());
				return value1;
		};
		int value1 = b.methodB("국어");
		System.out.printf("당신의 점수 %d 입니다.\n",value1);
		int value2 = b.methodB("영어");
		System.out.printf("당신의 점수 %d 입니다.\n",value2);
		System.out.println("=========================");
		
		System.out.println("The end");

	}

}
