package kh.supplier;

import java.util.Scanner;
import java.util.function.Supplier;

public class SupplierMain {

	public static void main(String[] args) {
		//함수형 인터페이스(추상메소드 1개) -> 구현클래스(오버라이딩) -> 부모 = 구현객체 -> 부모.추상메소드
		//Supplier<T> (T get) : 추상메소드 -> 구현클래스(x) -> 부모 = 구현객체(임시객체) -> 부모.추상메소드(람다식표현)
		Supplier<String> sup = ()-> {
				System.out.printf("이름입력 : ");
				Scanner scan = new Scanner(System.in);
				String name = scan.nextLine();
				return String.format("%s님은 질문 멋쟁이", name);
		};
		String value = sup.get();
		System.out.println(value);
		
		
		System.out.println("The end");

	}

}
