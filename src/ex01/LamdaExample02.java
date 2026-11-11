package ex01;

import java.util.function.Predicate;

public class LamdaExample02 {

	public static void main(String[] args) {
		// 자바에는 내재되어 있는 편리한 기능들이 아주 많다!
		// 정수를 입력해서 참 또는 거짓으로 리턴하는 함수 만들기
	    /*
		Predicate<Integer> isStrong = 	
		
		public static boolean isStrong (int x) {
			// 10보다 크면 true
			// 10보다 작으면 false 
			if (x >= 10) {
				return true;
			} else {
				return false;
			}
			
		// Predicate <Type> 객체명 = 사용할 메소드 목록 
		// 객체명.test(비교할 값) => true or false 
		System.out.println(isStrong(10));
		System.out.println(isStrong(9));
		
		}
        */
		Predicate<Integer> isStrong = (x) -> x >= 10;
		
		System.out.println(isStrong.test(10));
		System.out.println(isStrong.test(9));
		
	}
}
