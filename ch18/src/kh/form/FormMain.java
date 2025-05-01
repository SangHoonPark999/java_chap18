package kh.form;

public class FormMain {

	public static void main(String[] args) {
		//학생성적 프로그램 테이블
		System.out.printf("%-10s %-5s %-5s %-5s %-5s %-5s %-6.2s\n","이름","번호","국어","영어","수학","총점","평균");
		
		for(int i=0;i<5;i++) {
			System.out.printf("%-10s %-5d %-5d %-5d %-5d %-5d %-6.2f\n","홍길동",10,100,90,80,200,43.1);
		}
		System.out.println("The end");

	}

}
