import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int i,k,number=0,sayac=0;
        double ort;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        k = input.nextInt();

        for(i= 0;i <= k; i ++){
            if((i % 3) == 0 && (i % 4) == 0){

               number += i;
               sayac ++;

            }
        }
        ort = (number / sayac);
        System.out.println("ortalama = " +ort);
    }
}
