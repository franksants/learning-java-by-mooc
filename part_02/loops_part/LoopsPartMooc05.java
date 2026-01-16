import java.util.Scanner;
public class LoopsPartMooc05{
    public static void main(String[] args){
        int sum = 0;
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Give a number here: ");
            int number = Integer.valueOf(input.nextLine());
            if(number == 0){
                String result = "The sum of all is " + sum + ".";
                System.out.println(result);
                break;
            }
            sum+=number;
        }
    }
}
