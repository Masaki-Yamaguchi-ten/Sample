package bmi;

public class Person {

	public static void printData(String fn, String ln, int age, double height, double weight) {
		System.out.println("----------------------");
		System.out.println("名前は"+fullName(fn,ln)+"です");
		System.out.println("年齢は"+age+"です");
			if(age>=20) {
				System.out.println("成年者です");
			}else {
				System.out.println("未成年者です");
			}
		System.out.println("身長は"+height+"mです");
		System.out.println("体重は"+weight+"kgです");
		double bmi = bmi(height,weight);
		System.out.println("bmiは"+Math.round(bmi)+"です");
			if(isHealthy(bmi)) {
				System.out.println("健康です");
			}else{
			      System.out.println("健康ではありません");
		    }

		}

		public static String fullName(String fn, String ln) {
			return fn+""+ln;
		}

		public static double bmi(double height, double weight) {
			return weight / height / height;
		}

		  public static boolean isHealthy(double bmi){
			    return bmi >= 18.5 && bmi < 25.0;
		}

}
