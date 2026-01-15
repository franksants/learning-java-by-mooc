import java.util.Scanner;
public class ConditionalPartMooc02{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String result = "";
        int firstNumber = Integer.valueOf(input.nextLine());
        int secondNumber = Integer.valueOf(input.nextLine());
        if(firstNumber < secondNumber)
            result = "The " + secondNumber + " is heaver than " + firstNumber;
        else if(firstNumber > secondNumber)
            result = "The " + firstNumber + " is heaver than " + secondNumber;
        else 
            result = "Both are equals.";

        System.out.println(result);
        input.close();
    }
}
