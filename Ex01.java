
public class Ex01 {

	public static void main(String[] args) {

		// ������ �迭�� ����
		// �ڷ���[][] �迭�� = new �ڷ���[ù��° ���� ũ��][�ι�° ���� ũ��]

		// 5�� 5���� �迭 �����ϱ�

		int[][] array = new int[5][5];

		// 1. �迭�� ������ �� �����ϱ�
		int cnt = 21;
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length; i++) {
				array[j][i] = cnt++;
			}
		}
		// 2. �迭�� ���� �� Ȯ���ϱ�
		// �ִ밢�� ��Ī
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length; i++) {
				if (array[j][i] < 10) {
					System.out.print(" " + array[i][j] + " ");
				} else {
					System.out.print(array[i][j] + " "); // "\t" �Է��� �־��ָ� ������ ũ�⸸ŭ�� ��
				}
			}
			System.out.println();
		}
		// array[i].length ������ ũ�Ⱑ �ٸ��� ��� ���� ����
		// int[][] arr =new int[][];
		
		// arr[0] =new int[1]; 0�࿡ ũ�Ⱑ 1�� ���� ����
		// arr[1] =new int[2]; 1�࿡ ũ�Ⱑ 2�� ���� ����
		
		// arr[0][0]=1;
		// arr[1][0]=2;
		// arr[1][1]=3;
	}
}
