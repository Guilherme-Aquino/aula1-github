package git_course;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá");
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int x = n * m;
		
		System.out.println(x);
		
		sc.close();
	}

}
