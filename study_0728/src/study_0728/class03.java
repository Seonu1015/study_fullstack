package study_0728;

public class class03 {
	public static void main(String[] args) {
		

		int[] arr = new int[5];
		
//		arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 3;
//		arr[3] = 4;
//		arr[4] = 5;
		for(int i = 0; i<5; i++) {
			arr[i] = i+1;
		}
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		for(int i = 0; i<5; i++) {
			System.out.println(arr[i]);
		}
		
		
		// 400
		
		int[] arr2 = new int[400];
		
		for(int i = 0; i<400; i++) {
			arr2[i] = 2*i;
			System.out.print(arr2[i] + " ");
		}
		
		
		//
		System.out.println();
		//
		
		int[] arr3 = {1,2,3,4,5,6,7,8,9,6,8,9,0,1,2,3,4,5,6,3,4,8};
		for(int i=0; i<arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		
		
		
		
		
	}
}


// 배열(Array)
// 변수 -> 박스1
// 박스를 이어 놓은 것
// 자료형[] 배열명 = new 자료형[]

// 자료형 변수명; <- 선언 끝! 하지만 이대로 넘기면 쓰레기 값이 들어있음
// 자료형[] 변수명; <- 마찬가지로 쓰레기 값이 들어가는데 배열이라 너무 많은 쓰레기값이 들어간다

