import java.util.Scanner;

public class sumaLiczbPrzezSzesc {
    public static void main(String[] args) {
        System.out.print("Podaj wartość: ");
        Scanner userInput = new Scanner(System.in);
        int countNum = userInput.nextInt();
        int sum = 0;

        for (int i=1; i<=countNum; i++){
            if (i%6==0) {
                sum+=i;
                System.out.println(i);
            }
        }
        System.out.println("Suma liczb to:");
        System.out.println(sum);
    }
}
