import java.util.Scanner;

public class laba1 {
   public static void main(String args[]) {
	int k, temp;		
	Scanner scan= new Scanner(System.in);
	int num=scan.nextInt();
        for (int i=2; i<=num; i++) {
	   k = 0;
	   boolean isPrime=true;
           for (int j=1; j<=i; j++){
           	temp = i % j;
	   	if (temp == 0) {
		  k = k+1;}
		if (k > 2){
	          isPrime = false;
	          break;
		}
	   }
	if(isPrime) {
	   System.out.println(i + " - простое число");}
	}
   }
}