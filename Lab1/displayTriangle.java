import java.util.Scanner;
public class displayTriangle {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the triangle height: ");
		int iHeight = keyboard.nextInt();
		String Space = " ";
		String TriangleDot = "*";
		for (int i = 1;i <= iHeight; i++) {
			System.out.println(Space.repeat(iHeight - i) + TriangleDot.repeat(i * 2 - 1));
		}
	}

}
	