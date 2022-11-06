import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Hello! I will suggest you an advice due to air condition\n Please type temperature : ");
        int degree = input.nextInt();
        if (degree<5)
        {
            System.out.printf("You should go Skiing !!");
        }
        if (degree>=5 && degree<15)
        {
            System.out.printf("You should go Cinema !!");
        }
        if (degree>=15 && degree<25)
        {
            System.out.printf("You should go Picnic !!");
        }
        if (degree>=25)
        {
            System.out.printf("You should go Swimming !!");
        }
    }
}