import java.util.Scanner;
public class LoopsPartMooc06{
    public static void main(String[] args){
        int sum=0, numberInputted=0;
        Scanner input = new Scanner(System.in);
        
        while(true){
            System.out.println("Give a number here: ");
            int number = Integer.valueOf(input.nextLine());
            if(number == 0){
                System.out.println("The sum of all is: " + sum + "\nNumbers given: " + numberInputted);
                break;
            }
            sum+=number;
            numberInputted++;
        }
    }
}
