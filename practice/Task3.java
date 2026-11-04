import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter number: ");
            int a= sc.nextInt();
            if(a%2!=0){
                break;
            }
            int divisor=0;
            for(int i=1; i<=a; i++){
                if(a%i==0){
                    divisor++;
                }
            }
            System.out.println(a+" has "+divisor+" divisors");
        }
    }
}
                    
            