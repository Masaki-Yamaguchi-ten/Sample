import java.util.InputMismatchException;
import java.util.Scanner;

public class DentakuMain {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		try {
			int cal = 0;
			double ans;

			while(cal>4 || cal<1) {
				System.out.println("計算方法を選んでください。");
				System.out.println("1.足し算 2.引き算 3.掛け算 4.割り算");
				cal = scanner.nextInt();
			}

			System.out.println("1つめの数字を入力してください。");
			double num1 = scanner.nextDouble();

			System.out.println("2つめの数字を入力してください。");
			double num2 = scanner.nextDouble();

			switch(cal) {
				case 1:
					System.out.println("結果：");
					System.out.println(add(num1,num2));
					break;
				case 2:
					System.out.println("結果：");
					System.out.println(pull(num1,num2));
					break;
				case 3:
					System.out.println("結果：");
					System.out.println(multiply(num1,num2));
					break;
				case 4:
					System.out.println("結果：");
					System.out.println(divide(num1,num2));
					break;

			}
		}catch(InputMismatchException e){
			System.out.println("数字を入力してください！");
		}


	}
	public static double add(double num1, double num2) {
		return num1 + num2;
	}

	public static double pull(double num1, double num2) {
		return num1 - num2;
	}

	public static double multiply(double num1, double num2) {
		return num1 * num2;
	}

	public static double divide(double num1, double num2) {
		return num1 / num2;
	}



}
