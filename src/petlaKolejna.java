import java.util.Scanner;

public class petlaKolejna {
    public static void main(String[] args) {
        System.out.print("Wpisz ilosc liczb: ");
        Scanner sc = new Scanner(System.in);

        int iterator=sc.nextInt();
        System.out.print("Podaj wartosc: ");
        int nextNum;
        int sumOfNum=0;

        for (int i=0; i<iterator; i++){
            nextNum= sc.nextInt();
            if (nextNum%6==0) {
                sumOfNum=sumOfNum+nextNum;
            }
        }
        System.out.println(sumOfNum);
    }
}
