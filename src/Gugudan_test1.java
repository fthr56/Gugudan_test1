import java.util.Scanner;

public class Gugudan_test1 {
	public static void main(String[] args){

		System.out.println("���ڸ� �Է��ϼ���.");
		Scanner scanner = new Scanner(System.in);
        int dan = scanner.nextInt();
        
        for(int i = 2; i<=dan; i++){
        	for(int j=1; j<=dan; j++){
        		System.out.println(i + " * " + j + " = " + i*j);
        	}
        }
	}
}
