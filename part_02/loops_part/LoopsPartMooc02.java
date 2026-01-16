import java.util.Scanner;
public class LoopsPartMooc02{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Give a number here: ");
            int userInput = Integer.valueOf(input.nextLine());
            if(userInput == 4)
                break;
        }
    }
}
