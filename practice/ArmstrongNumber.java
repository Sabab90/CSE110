import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting number of the range: ");
        int start = scanner.nextInt();
        
        System.out.print("Enter the ending number of the range: ");
        int end = scanner.nextInt();
        
        
        for(; start<=end; start++){
            int result = 0;
            int numDigits = 0;
            int temp = start;
            int original= start;
            
            while (temp != 0) {
                temp /= 10;
                numDigits++;
            }
            
            temp = start;
            while (temp != 0) {
                int remainder = temp % 10;
                result += Math.pow(remainder, numDigits);  // Raise each digit to the power of numDigits
                temp /= 10;
            }
            if(result== original){
                System.out.println(result);
            }
        }
    }
}



