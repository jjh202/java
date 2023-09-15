package ch12;

public class StringBufferTest2 {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("java ");
		StringBuffer sb2 = new StringBuffer("easy ");
		System.out.println(sb1.append("korea")); // korea 추가
		System.out.println(sb2.append(sb1)); // sb1 추가
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb2.substring(5,9)); // easy java korea (5,9)만 빼서 출력
		System.out.println(sb2.delete(5, 10));  // easy java korea (5,10)까지 삭제
		System.out.println(sb2);
		System.out.println(sb1.reverse()); // java korea 반대로 출력
	}
}
