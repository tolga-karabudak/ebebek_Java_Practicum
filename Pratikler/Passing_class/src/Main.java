import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double point,totalPoint=0;
        double flag = 0;
        String[] lessons = {"Matematik", "Fizik", "Türkçe", "Kimya", "Müzik" };

        for (int i=0; i< lessons.length; i++)
        {
            System.out.printf(lessons[i] + " puanınızı giriniz : ");
            point = input.nextInt();
            if (point>0 && point <100)
            {
                totalPoint = totalPoint + point;
                flag++;
            }


        }
        System.out.printf("Geçersiz dersleri çıkardığımızdan sonra ortalama  : " + totalPoint / flag );



    }
}