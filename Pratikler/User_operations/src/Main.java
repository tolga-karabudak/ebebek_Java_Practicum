import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username,password;
        String password1;
        char choise;
        Scanner input = new Scanner(System.in);
        boolean noSelection = true;

        System.out.print("Kullanıcı Adı : ");
        username = input.nextLine();
        System.out.print("Şifre : ");
        password = input.nextLine();

        if (username.equals("patika") && password.equals("ebebek")){
            System.out.print("Your Username and Password are correct !! \n");
        }
        else{
            System.out.printf("Your Username or Password are incorrect !! \n");
            System.out.printf("Do you want a new password ? (y/n) ");
            do{


                choise = input.next().charAt(0);
                switch (choise){
                    case 'y':
                        noSelection = false;
                        break;
                    case 'n':
                        System.out.println("Have a nice day Bye !");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Thats not a valid entry! Please entry (y) or (n)");
                }

            }while(noSelection);
            System.out.printf("Type your new password : ");
            password1 = input.next();
            if(password1.equals(password))
            {
                System.out.printf("Your password is the same the older one!!");
            }
            else {
                System.out.printf("Password generated !! ");
            }



        }



    }
}