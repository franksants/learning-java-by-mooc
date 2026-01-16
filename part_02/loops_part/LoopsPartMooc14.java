import java.util.Scanner;
public class LoopsPartMooc14{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sum=1;
        System.out.print("\nGive a number: ");
        int number = Integer.valueOf(input.nextLine());

        for(int i = 1; i <= number; i++){
            sum*=i;
        }
        System.out.println("Factorial: " + sum);
    }
}
