import java.util.Scanner;
public class LoopsPartMooc07{
    public static void main(String[] args){
        int sum=0, numbersInputted=0;
        Scanner input = new Scanner(System.in);
        
        while(true){
            System.out.println("Give a number here: ");
            int number = Integer.valueOf(input.nextLine());
            if(number == 0){
                if(numbersInputted == 0){
                    System.out.println("You did not give a valid number yet!");
                    continue;
                }
                System.out.println("The average of all is: " + (sum / numbersInputted));
                break;
            }
            sum+=number;
            numbersInputted++;
        }
    }
}
