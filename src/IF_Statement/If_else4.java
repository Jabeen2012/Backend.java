package IF_Statement;

public class If_else4 {

	public static void main(String[] args) {
		// largest of three numbers
		int a = 30;
		int b = 50;
		int c = 29;
		if(a >= b && a >= c) {
			System.out.println("largest number is :"+a);
		}else if(b >= a && b >=c) {
			System.out.println("largest number is :" +b);
		} else {
			System.out.println("largest number is :" +c);
		}

	}

}
