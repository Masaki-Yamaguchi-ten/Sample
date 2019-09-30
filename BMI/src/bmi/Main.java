package bmi;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		System.out.print("名前：");
		String fn = scanner.next();

		System.out.print("苗字：");
		String ln = scanner.next();

		System.out.print("年齢：");
		int age=0;
		try {
			age = scanner.nextInt();
		}catch(InputMismatchException e){
			System.out.println("数値でない値が入力されています");
			System.exit(0);
		}


		System.out.print("身長(m)：");
		double height = 0;
		try {
			height = scanner.nextDouble();
		}catch(InputMismatchException e){
			System.out.println("数値でない値が入力されています");
			System.exit(0);
		}

		System.out.print("体重(kg)：");
		double weight = 0;
		try {
			weight = scanner.nextDouble();
		}catch(InputMismatchException e){
			System.out.println("数値でない値が入力されています");
			System.exit(0);
		}
		Person.printData(fn, ln, age, height, weight);


	}

}
