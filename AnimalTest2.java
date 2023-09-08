package ch11;

/*
 * 작성일 : 2023년 9월 8일
 * 작성자 : 컴퓨터공학과 202095081 장준환
 * 설명 : 추상 클래스 - 동물의 울음소리를 출력
 * 		 클래스 메소드
 */
// 추상 클래스 - 동물
abstract class myAnimal2 {
	// 추상 메소드 : 동물의 소리를 반환하는 메소드
	abstract String sound2();
	
	// 클래스 메소드 : 동물의 기본 정보 출력하는 메소드
	static void displayInfo2() {
		System.out.println("동물의 울음소리 입니다.");
	}
}

// 고양이 클래스 - 추상 클래스 상속
// 고양이 울음소리 반환
class myCat2 extends myAnimal2 {

	@Override
	String sound2() {
		// 재정의.
		return "야옹~~";
	}
	
	/*@Override
	static void displayInfo2() {*/
	// 오류 발생 이유 : 정적 메서드는 메서드 오버라이딩 대신, 메서드를 숨기거나 클래스 수준에서 호출되는 것이 일반적인 용도입니다.
	static void displayInfo2() {
		// TODO Auto-generated method stub
		System.out.println("고양이 울음소리 입니다.");
	}	
	
}

public class AnimalTest2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myAnimal2 cat = new myCat2();
		
		cat.displayInfo2();
		System.out.println(cat.sound2());
	}

}

