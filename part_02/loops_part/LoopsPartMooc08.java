import java.util.Scanner;
public class LoopsPartMooc08{
    public static void main(String[] args){
        int sum=0, numbersInputted=0;
        Scanner input = new Scanner(System.in);
        
        while(true){
            System.out.println("Give a number here: ");
            int number = Integer.valueOf(input.nextLine());
            if(number == 0){
                if(sum == 0){
                    System.out.println("Cannot calculate the average.");
                    continue;
                }
                System.out.println("The average all positive number is: " + (sum / numbersInputted));
                break;
            }
            if(number > 0){
                sum+=number;
                numbersInputted++;
            }
        }
    }
}
