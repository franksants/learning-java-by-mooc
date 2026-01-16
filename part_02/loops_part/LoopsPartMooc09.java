import java.util.Scanner;
public class LoopsPartMooc09{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = Integer.valueOf(input.nextLine());
        for(int i = 0; i <= number; i++){
            System.out.println(i);
        }
    }
}
