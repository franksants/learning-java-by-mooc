import java.util.Scanner;
public class LoopsPartMooc10{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = Integer.valueOf(input.nextLine());
        while(number <= 100){
            System.out.println(number);
            number++;
        }
    }
}
