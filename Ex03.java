import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		// �޼ҵ�
		// ��ü�� ������ ǥ��
		// �ݺ������� ���Ǵ� �ڵ� �ּ�ȭ
		// � �۾��� �����ϱ� ���� ��ɹ��� ����

		// Ŭ������ ���� ��ġ�� �޼ҵ带 ������ ���
		// ��! static Ű���� �ٿ��ֱ�!!
		
		// 1. �޼ҵ��� ����
		// - ���� ������ : public
		// - ���� Ÿ�� : �޼ҵ� ���� ���� ��������� ���ƿ��� �����Ϳ� ���� Ÿ��
		// - �޼ҵ��� �̸�
		// - �޼ҵ尡 ����� X�� -> �޼ҵ� �Ű�����, �Ұ�ȣ �ȿ� �� ����

		Scanner sc = new Scanner(System.in);

		System.out.print("ù��° ���� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�ι�° ���� : ");
		int num2 = sc.nextInt();
		
		;
		int result=addNumber(num1, num2);
		System.out.println(result);
		sc.close();
		
		// �޼ҵ�� ũ�� �޼ҵ� ȣ��� �޼ҵ� ���Ƿ� �۾��� ����ȴ�.
		
	}	// main() ������ �κ�
		// ���Ӱ� �޼ҵ带 ���� �� �ִ� ����!!!
		// ���������� public -> ����/�ܺ� ��𼭵� ������ ������ ������
		public static int addNumber(int x1, int x2) {
			int result = x1 + x2;
			return result; 
			
		}
}	// class ������ �κ�
