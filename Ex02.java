
public class Ex02 {

	public static void main(String[] args) {

		int[][] array = new int[5][5];
		int cnt = 21;
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length; i++) {
				array[j][i] = cnt++;
			}
		}
		// 좌우반전
		for (int j = 0; j < array.length; j++) {
			for (int i = array.length-1; i >=0 ; i--) {
				if (array[j][i] < 10) {
					System.out.print(" " + array[j][i] + " ");
				} else {
					System.out.print(array[j][i] + "\t"); // "\t" 입력을 넣어주면 일정한 크기만큼만 들어감
				}
			}
			System.out.println();
	}

}
}
