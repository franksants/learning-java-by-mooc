import java.util.Scanner;
public class LoopsPartMooc13{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sum=0;
        System.out.print("\nFirst number: ");
        int firstNumber = Integer.valueOf(input.nextLine());

        System.out.print("\nLast number: ");
        int lastNumber = Integer.valueOf(input.nextLine());
        for(int i = firstNumber; i <= lastNumber; i++){
            sum+=i;
        }
        System.out.println("The sum is " + sum);
    }
}
