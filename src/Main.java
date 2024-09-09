import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu numero: ");
        int n = sc.nextInt();

        verifyNumber(n);

        sc.close();
    }

    public static void verifyNumber(int n){

        if (n < 10){
            while (n <= 5) {
                System.out.println("numero = " + n);
                n++;
            }
        } else{
            System.out.println("Seu numero eh maior que 10");
        }
    }
}