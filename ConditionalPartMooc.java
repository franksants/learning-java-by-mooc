import java.util.Scanner;
public class ConditionalPartMooc{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int result = 0;
        int number = Integer.valueOf(input.nextLine());
        if(number < 0){
            result = (-1) * number;
        }else result = number;

        System.out.println(result);
        input.close();
    }
}
