
public class Ex01 {

	public static void main(String[] args) {

		// 이차원 배열의 생성
		// 자료형[][] 배열명 = new 자료형[첫번째 방의 크기][두번째 방의 크기]

		// 5행 5열의 배열 생성하기

		int[][] array = new int[5][5];

		// 1. 배열에 데이터 값 저장하기
		int cnt = 21;
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length; i++) {
				array[j][i] = cnt++;
			}
		}
		// 2. 배열에 대한 값 확인하기
		// 주대각선 대칭
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length; i++) {
				if (array[j][i] < 10) {
					System.out.print(" " + array[i][j] + " ");
				} else {
					System.out.print(array[i][j] + " "); // "\t" 입력을 넣어주면 일정한 크기만큼만 들어감
				}
			}
			System.out.println();
		}
		// array[i].length 차원의 크기가 다를때 사용 층의 개수
		// int[][] arr =new int[][];
		
		// arr[0] =new int[1]; 0행에 크기가 1인 열을 생성
		// arr[1] =new int[2]; 1행에 크기가 2인 열을 생성
		
		// arr[0][0]=1;
		// arr[1][0]=2;
		// arr[1][1]=3;
	}
}
