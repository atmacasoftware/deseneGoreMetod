import java.util.Scanner;

public class Main {

    public static void pattern(int number, int patternNumber){
        if(number <= 0){
            System.out.print(number + " ");
            return;
        }

        System.out.print(number + " ");
        pattern(number - patternNumber, patternNumber);
        System.out.print(number + " ");
    }


    public static void main(String[] args) {
        //Defining variables
        int select, number, patternNumber;

        //Import Scanner Class
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println(" ");
            System.out.println("Seçim Yapınız");
            System.out.println("1- Hesapla\n2-Çıkış");

            try{
                //Getting value from user
                select = input.nextInt();

                if(select == 2){
                    System.out.println("Çıkış yapıldı.");
                    break;
                }

                System.out.print("Deseni oluşturulacak sayı giriniz : ");
                number = input.nextInt();

                System.out.print("Desen kuralı olan sayıyı giriniz : ");
                patternNumber = input.nextInt();

                pattern(number, patternNumber);
            }catch (Exception e){
                System.out.println("Hatalı bir değer girildi.");
                break;
            }

        }

    }
}