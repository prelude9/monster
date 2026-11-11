package ex01;
/** Monster.java: 모든 몬스터 객체가 함께 사용하는 설계도입니다. */
public class Monster {
    // 필드: 몬스터가 가지고 있는 정보입니다.
    private String name;
    private String grade;
    private int level;
    private int exp;
    private String element;
    private int age; //private이라 외부에서 접근이 안 됨. get 메소드~ 

    // 오버로딩.. 입력값에 따라 값이 달라님. 
    // 생성자: 새 몬스터를 만들 때 필요한 정보를 받습니다.
    public Monster(String name, String grade, int level, int exp, String element, int age) {
        this.name = name;
        this.grade = grade;
        this.level = level;
        this.exp = exp;
        this.element = element;
        this.age =age;    
    }

    // Getter: private 필드의 값을 읽을 수 있도록 도와줍니다. private이기 때문에 외부에서 읽을 수 있도록 해준다
	public String getName() {
		return name;
	}

	public String getGrade() {
		return grade;
	}

	public int getLevel() {
		return level;
	}

	public int getExp() {
		return exp;
	}

	public String getElement() {
		return element;
	}

	public int getAge() {
		return age;
	}

	// 도감에 표시할 정보를 한 줄의 문자열로 만들어 줍니다.
    public String getInfo() {
        return name + " / " + grade + " / 레벨 " + level
                + " / 경험치 " + exp + " / 속성 " + element + " / 나이 " + age ;
    }
}
