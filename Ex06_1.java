import java.util.Scanner;

public class Ex06_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("������ �Է� : ");
		String cal = sc.next();
		System.out.print("�ι�° ���� �Է� : ");
		int num2 = sc.nextInt();

		String result = calNumber(num1, num2, cal);
		System.out.println(num1+cal+num2+"="+result);
		sc.close();
	}

	private static String calNumber(int num1, int num2, String cal) {
		int result = 0;
		switch (cal) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		}
		return result+"";
	}
}

