import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int right=3;
        int select;
        int balance=1500;
        while(right>0){
            System.out.print("Please Enter your Username :");
            String username= inp.nextLine();

            System.out.print("Please Enter your password :");
            String password= inp.nextLine();

            if(username.equals("patika")&&password.equals("ebebek")){
                System.out.println("Welcome the eBebek/Patika Bank !!");

                do{
                    System.out.println("Please make a choise :\n1-Deposit Money\n2-WithDraw money\n3-Balance Control\n4-:Exit");
                    select= inp.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Please enter the amount of money to deposit :");
                            int enterMany= inp.nextInt();
                            balance+=enterMany;
                            break;
                        case 2:
                            System.out.print("Please enter the amount money to withdraw :");
                            int autMany= inp.nextInt();
                            if(autMany>balance){
                                System.out.println("Not enough balance!");

                            }else{
                                balance-=autMany;
                            }
                            break;
                        case 3:
                            System.out.println("Your balance :"+balance);
                            break;


                    }
                }while(select!=4);
                System.out.println("See you soon!");
                break;
            }else {
                right--;
                System.out.println("Your username or password is incorrect !");
                if(right==0){
                    System.out.println("Your account has been blocked. Please contact our customer service");
                }else{
                    System.out.println("Remaining entry  :"+right);
                }
            }


        }


    }

}