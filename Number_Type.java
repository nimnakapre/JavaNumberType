import java.util.Scanner;

public class Number_Type{
	public static void main (String[] args) {
		System.out.println("Enter your number: ");
		Scanner readinput=new Scanner(System.in);
		int N = readinput.nextInt();
		
		if((N%25==0 && N%100!=0) && (N%4==0 && N%128!=0)){
			System.out.println("Type A and Type B");
		}else if(N%25==0 && N%100!=0){
			System.out.println("Type A");
		
		}else if(N%4==0 && N%128!=0){
			System.out.println("Type b");
		}
		else{
			System.out.println("Not(Type A and Type B)");
		}
			
			
		
		
	}
}