package ex01;

import java.util.function.Consumer;

public class LamdaExample01 {

	public static void main(String[] args) {
		Consumer<String> greeting = name -> System.out.println(name + "님, 반갑습니다!");
		
		greeting.accept("지우");
	// Consumer는 조금 위험해~ 

	}

	public static void sayHello(String name){ //메인에서 쓸 수 있도록 static을 붙였음 // 매개변수
		System.out.println(name = "님, 반갑습니다!"); // 함수본체
		
	}
}
