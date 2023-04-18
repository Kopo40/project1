package Package;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		////////////////////////////////
		// #1. 연산후 대입.
		int kopo40; // 정수형 변수 선언
		kopo40 = 1+2; // 선언한 정수형 변수 kopo40값 초기화
		System.out.printf("#1-1 : %d\n" , kopo40); // 첫번째 결과를 출력. %d로 정수형 변수의 위치 설정, \n으로 새로운 줄로 개행 처리
		//////
		kopo40 = 1+2*3; // 변수의 값 새로 초기화
		System.out.printf("#1-2 : %d\n" , kopo40); // 두번째 결과를 출력. 3*2를 먼저 하고 1을 더했으므로 결과값은 7이 출력됨.
	}

}
