import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int add = addNumber(num1, num2);
		int sub = subNumber(num1, num2);
		int mul = mulNumber(num1, num2);
		int div = divNumber(num1, num2);
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		sc.close();
	}

	private static int divNumber(int x1, int x2) {
		int div = x1 / x2;
		return div;
	}

	private static int mulNumber(int x1, int x2) {
		int mul = x1 * x2;
		return mul;
	}

	private static int subNumber(int x1, int x2) {
		int sub = x1 - x2;
		return sub;
	}

	private static int addNumber(int x1, int x2) {
		int add = x1 + x2;
		return add;
	}

}
