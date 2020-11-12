//시험 점수를 입력받아
//100~90점은 A, 89~80점은 B, 79~70점은 C, 69~60점은 D, 나머지는 F 출력
package testJava;

import java.util.Scanner;

public class Testjava {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int score = sc.nextInt();
		sc. close();
		
		if(score >=90) {
			System.out.println("A");
		}else if (score >=80){
			System.out.println("B");
		}else if (score >=70){
			System.out.println("C");
		}else if (score >=60){
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}
		

}
