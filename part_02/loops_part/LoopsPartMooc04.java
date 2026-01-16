import java.util.Scanner;
public class LoopsPartMooc04{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int negativeNumber = 0;
        while(true){
            System.out.println("Give a number here: ");
            int number = Integer.valueOf(input.nextLine());
            if(number < 0)
                negativeNumber++;
            else if(number == 0){
                System.out.println("There are " + negativeNumber + " negative number(s).");
                break;
            }
        }
    }
}
