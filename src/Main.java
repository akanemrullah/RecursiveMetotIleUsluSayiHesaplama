import java.util.Scanner;

public class Main {

    // Recursive metot mantik cercevesinde yazildi.
    static int power(int a, int b) {
        int result = 1;

        while( b <= 1){
            return a;
        }
        result *= a;
        return result * power(a,b-1);
    }

    public static void main(String[] args) {

        // Kullanicidan deger alabilmek adina scanner sinifini projeye dahil ettik.
        Scanner input = new Scanner(System.in);

        // Gerekli degiskenler tanimlandi.
        int number, power, result;

        // Kullaniciya cikti verilip deger girmesi istendi. Bu degerler ilgili degiskenlere atandi.
        System.out.print("Taban değeri giriniz : ");
        number = input.nextInt();

        System.out.print("Üs değerini giriniz : ");
        power = input.nextInt();

        // Sonucu cikti ile kullaniciya ilettik. Metot u dogrudan cikti verirken cagirdik.
        System.out.println("Sonuc: "+ power(number,power));

    }
}