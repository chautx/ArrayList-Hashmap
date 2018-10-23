import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		try {
		System.out.println(" Nhap so a:");
		int num1 = input.nextInt();
		System.out.println(" Nhap so b: ");
		int num2 = input.nextInt();
		System.out.println("Ket qua: " + num1/num2);
		} catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("chuong trinh loi");
		} catch(InputMismatchException e) {
			e.printStackTrace();
			System.out.println(" Ban nhap sai kieu roi");
		}
		
		
		

	}

}
