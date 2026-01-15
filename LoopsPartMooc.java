import java.util.Scanner;
public class LoopsPartMooc{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Could we continue?");
            String userInput = input.nextLine();
            if(userInput.equalsIgnoreCase("no"))
                break;
        }
    }
}
