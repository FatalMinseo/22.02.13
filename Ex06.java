import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("연산자 입력 : ");
		String cal = sc.next();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();

		String add = "+";
		String sub = "-";
		String mul = "*";
		String div = "/";
		String add1 = addNumber(num1, num2, cal);
		String sub1 = subNumber(num1, num2, cal);
		String mul1 = mulNumber(num1, num2, cal);
		String div1 = divNumber(num1, num2, cal);

		System.out.print(num1 + cal + num2 +"=" );
		
		if (cal.equals(add)) {
			System.out.print(add1);
		} else if (cal.equals(sub)) {
			System.out.print(sub1);
		} else if (cal.equals(mul)) {
			System.out.print(mul1);
		} else if (cal.equals(div)) {
			System.out.print(div1);
		}
		sc.close();
	}

	public static String divNumber(int num1, int num2, String cal) {
		int div1 = num1 / num2;
		return div1 + "";
	}

	public static String mulNumber(int num1, int num2, String cal) {
		int mul1 = num1 * num2;
		return mul1 + "";
	}

	public static String subNumber(int num1, int num2, String cal) {
		int sub1 = num1 - num2;
		return sub1 + "";
	}

	public static String addNumber(int num1, int num2, String cal) {
		int add1 = num1 + num2;
		return add1 + "";
	}

}
