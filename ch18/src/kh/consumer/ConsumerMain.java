package kh.consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class ConsumerMain {

	public static void main(String[] args) {
		//인터페이스->구현클래스->구현객체->부자관계->부.추상메소드
		//Consumer X ->x->구현객체(부자관계 포함)->부.추상메소드
		Consumer<String> con = t-> System.out.printf("%s 님 어서옵쇼.\n",t);
		con.accept("홍길동");
		con.accept("구길동");
		con.accept("저길동");
		System.out.println("===========");
		Consumer<Integer> gu = t-> {
			System.out.printf("%d단 출력\n",t);
			for(int i = 1;i<10;i++) {
				System.out.printf("%d x %d = %d\n",t,i,t*i);
				}
			};
		gu.accept(6);
		//-----------------------------------------------------------------
		IntConsumer icon = t1-> {
				System.out.printf("%d단 출력\n",t1);
				for(int i = 1;i<10;i++) {
					System.out.printf("%d x %d = %d\n",t1,i,t1*i);
					}			
		};
		icon.accept(7);
		//-----------------------------------------------------------------
		BiConsumer<String, Integer> bicon = (name,age)-> System.out.printf("%s님의 나이는 %d입니다.\n",name, age);
		
		
		bicon.accept("거북이", 6);
		
		
		
		System.out.println("the end");
	}//main.end

}
