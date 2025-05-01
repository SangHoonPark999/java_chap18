package kh.function;

import java.util.function.Function;

public class FunctionMain {

	public static void main(String[] args) {
		//Function<T,R> => R apply(T t) 추상메소드
		String name = "거북이와두루미abc";
		Function<String, Integer> func = t-> t.length();
		int length = func.apply("홍길동");
		int length1 = func.apply(name);
		
		System.out.printf("리턴된 문자의 길이는 %d입니다\n", length);
		System.out.printf("%s의 리턴된 문자의 길이는 %d입니다\n",name, length1);
		System.out.printf("The end");
	}

}
