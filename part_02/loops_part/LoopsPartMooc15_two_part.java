import java.util.Scanner;
public class LoopsPartMooc15_two_part{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sum = 0, count = 0;
        int even = 0;
        System.out.println("Give numbers: ");
        while(true){
            int userInput = Integer.valueOf(input.nextLine());
            if(userInput == -1)
                break;
            sum+=userInput;
            count++;
            if(userInput % 2 == 0)
                even++;
        }
        double average = sum / count;
        System.out.println("Thx! Bye!\nSum: " + sum);
        System.out.println("Numbers: " + count + "\nAverage: " + average);
        System.out.println("Even: " + even + "\nOdd: " + (count - even));
    }
}
// end of Loops part of mooc java course
