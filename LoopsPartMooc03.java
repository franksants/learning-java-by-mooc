import java.util.Scanner;
public class LoopsPartMooc03{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Give a number here: ");
            int userInput = Integer.valueOf(input.nextLine());
            if(userInput == 0)
                break;
            if(userInput < 0){
                System.out.println("Invalide Number!");
                continue;
            }else
                System.out.println(userInput * userInput);
        }
    }
}
