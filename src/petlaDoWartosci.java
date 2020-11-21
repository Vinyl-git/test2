import java.util.Scanner;

public class petlaDoWartosci {
    public static void main(String[] args) {

        System.out.println("Wpisz wartość: ");

        Scanner userInput = new Scanner(System.in);
        int userNumber = userInput.nextInt();


        for (int x=1; x<=userNumber; x++) {
            if (x%2!=1) {
                System.out.println(x);
            }
        }
    }
}
