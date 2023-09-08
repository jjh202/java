package ch11;
/*
 * 작성일 : 2023년 9월 8일
 * 작성자 : 컴퓨터공학과 202095081 장준환
 * 설명 : 추상 클래스 - 동물의 울음소리를 출력
 */
// 추상 클래스 - 동물 
abstract class myAnimal {
		// 추상 메소드 : 동물의 소리를 반환하는 메소드
		/*abstract String sound() {
		}*/
		// 오류 발생 이유 : 추상 메서드는 메서드 본문(body)을 가질 수 없으며 세미콜론(;)으로 끝나야 합니다.
	abstract String sound();
		// 일반 메소드 : 동물의 기본 정보 출력하는 메소드
	void displayInfo() {
		System.out.println("동물의 울음소리 입니다.");
	}
}

//고양이 클래스 - 추상 클래스 상속
//고양이 울음소리 반환
class myCat extends myAnimal {

	@Override
	String sound() {
		// 재정의.
		return "야옹~~";
	}

	@Override
	void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println("고양이 울음소리 입니다.");
	}	
	
}
public class AnimalTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myAnimal cat = new myCat();
		
		cat.displayInfo();
		System.out.println(cat.sound());
	}
}
