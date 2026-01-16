import java.util.Scanner;
public class LoopsPartMooc12{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sum=1, count=1;
        System.out.print("\nLast number: ");
        int userInput = Integer.valueOf(input.nextLine());
        for(int i = 2; i <= userInput; i++){
            sum+=i;
        }
        System.out.println("The sum is " + sum);
    }
}
