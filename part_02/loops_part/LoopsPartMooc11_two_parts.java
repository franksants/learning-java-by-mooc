import java.util.Scanner;
public class LoopsPartMooc11_two_parts{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("\nWhere to? ");
        int number = Integer.valueOf(input.nextLine());
        
        System.out.print("\nWhere from? ");
        int numberFrom = Integer.valueOf(input.nextLine());
        while(numberFrom <= number){
            System.out.println(numberFrom);
            numberFrom++;
        }
    }
}
