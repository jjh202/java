package ch12;

public class StringTest2 {
	public static void main(String[] args) {
		String s1 = "Java Korea";
		String s2 = new String("Java Korea");
		String s3 = s2.intern(); // 내용이 같으면 주소값 반환 = 같은 주소 // s1과 s3는 같은 주소 같은 값을 가짐
		String s4 = "Java Korea";
		String s5 = new String("Java Korea");
		System.out.println("S1과 S2는 같은 장소? : " + (s1 == s2));
		System.out.println("S1과 S2는 값이 같은가? : " + (s1.equals(s2)));
		System.out.println("S1과 S3는 같은 장소? : " + (s1 == s3));
		System.out.println("S2와 s5는 같은 장소? : " + (s2 == s5));
		System.out.println("S2와 S5의 값이 같은가? : " + (s2.equals(s5)));
	}
}
