package study_0731;

public class class04 {

	public static void main(String[] args) {
		
//		String str = "자바";
//		str.equals("자바");
//		
//		String -> 변수가 아니다
//		클래스 -> 객체구나!
//		
//		public class String {
//			char[] c;
//		}
//			boolean equals(char c2) {}
//			
//		이런 식으로 자바 프로그램 내부에 이렇게 숨어있을 것이다!
		
		String greating = "Hello";
		String sentence = greating + "Professor";
		
		System.out.println(sentence);
		System.out.println(sentence.length());
		System.out.println(sentence.toLowerCase()); // 회원가입할 때, 중복된 아이디를 만들지 못하게 할 때 유용할 것이다
		System.out.println(sentence.toUpperCase());
		System.out.println(greating.replace("l", "z"));
		System.out.println(greating.substring(2)); // substring(a) -> a부터 끝까지
		System.out.println(sentence.substring(2, 9)); // substring(a,b) -> a부터 b전까지
		
		System.out.println(sentence.charAt(4));
		System.out.println(sentence.indexOf("f")); // 문자열에서 가장 앞에 있는 친구를 찾아서 반환해준다
		System.out.println(sentence.indexOf("p"));
		System.out.println(sentence.lastIndexOf("l")); // 가장 뒤에 있는 친구 받환
		
		System.out.println(greating.concat(sentence));
		System.out.println(greating.equals("hello"));
		System.out.println(greating.equalsIgnoreCase("hello"));
		System.out.println(greating.compareTo("Aello"));
		System.out.println(greating.compareTo("Hello"));
		System.out.println(greating.compareTo("Hezzo"));
		

	}

}

//String -> 변수가 아니다
//클래스 -> 객체구나!
//
//public class String {
//	char[] c;
//}
//	boolean equals(char c2) {}
	
// 이런 식으로 자바 프로그램 내부에 이렇게 숨어있을 것이다!