import java.util.Scanner;
public class Part02_01{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Write a first number here: ");
        int firstNumber = input.nextInt(); 
        
        System.out.println("Write a second number here: ");
        int secondNumber = input.nextInt();
        System.out.println((firstNumber + secondNumber) * (firstNumber + secondNumber));
    }
}
