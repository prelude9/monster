package ex01;

import java.util.List;

public class ChainExample {

	public static void main(String[] args) {
		// 1. 과일목록을 만든다 > 과일이 3개 밖에 없으므로 List 메소드 이용
		// 2. 과일목록 스트림 생성		
		 
		
		List <String> names = 
				List.of("banana", "apple", "cherry");
		
		names.stream()  // 스트림 시행
		     // 3. 'a'가 포함되었는가?
		     .filter(name -> name.contains("a"))
		     // 4. 대문자로 고쳐서 맵을 만든다
		     .map(name -> name.toUpperCase())
	    	 // 5. 순서정렬을 한다
		     .sorted()
     		 // 6. 과일목록의 각각의 이름을 출력
		     .forEach(name -> System.out.println(name));
		
		     // 데이터 넘기고 루프를 돌리면 되는 함수 >>> 람다 함수
	}

}
