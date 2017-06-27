import java.util.Scanner;

public class Gugudan_test2 {
	public static void main(String[] args){
		
		System.out.println("n,m 형식으로 값을 입력하시오.(n과 m은 숫자)");
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		
		String[] splitedValue = inputValue.split(",");
		
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		
		for(int dan=2; dan<=first; dan++){
			for(int number = 1; number <= second; number++){
				System.out.println(dan + "*" + number + " = " + dan*number);
			}
		}
	}
}
