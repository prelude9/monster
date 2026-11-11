package ex01;

import java.util.List;


public class MonsterTestApp {
	public static void main (String [] args) {
		// 1. 몬스터 목록 객체 생성
		List<Monster> monsters = List.of(
				new Monster("슬라임", "일반", 3, 100, "물", 0),
				new Monster("불꽃", "희귀", 8, 200, "불", 0),
				new Monster("버섯돌이", "일반", 5, 180, "풀", 0),
				new Monster("꼬마드래곤", "전설", 20, 1500, "불", 0),
				new Monster("얼음토끼", "희귀", 12, 700, "얼음", 0),
				new Monster("돌멩이", "일반", 2, 80, "땅", 0)
				);
		// 2. 몬스터 목록크기 열기
		System.out.println(monsters.size());
		
		// 3. 첫번째 몬스터 이름 알아보기(위치번호는 '0')
		System.out.println(monsters.get(0));
	
		
		// 1. 몬스터 리스트 데이타 처리
		//
		monsters.stream().forEach(monster -> System.out.println(monster.getName()));
		monsters.stream().forEach(monster -> System.out.println(monster.getInfo()));
		monsters.stream()
		        .filter(monster -> monster.getLevel()>=10)
		        .forEach(monster -> System.out.println(monster.getName()));
		monsters.stream()
		        .filter(monster -> monster.getGrade().equals("희귀"))
		        .forEach(monster -> System.out.println(monster.getName()));
		monsters.stream()
				.filter(monster -> monster.getElement().equals("불"))
		        .forEach(monster -> System.out.println(monster.getName()));
		// 리스트에 들어있는 monster 객체는 값은 갔더라고 메모리 위치가 다르다
		// 리스트의 객체를 맵의 키로 쓸 수 있다. >> 이 방법을 활용하면 속도가 훨씬 빠르다! 
		monsters.stream()
		        .map(monster -> monster.getName())
		        .forEach(name -> System.out.println(name));
		
		long totalcount = monsters.stream().count();
		System.out.println("total = " + totalcount);
	}

}
