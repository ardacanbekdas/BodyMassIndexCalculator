package PatikaOdevlerVePratikler;

import java.util.Scanner;

public class BodyMassIndexCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu metre cinsinden giriniz: ");
        double metre = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        double kg = input.nextDouble();

        double index = kg / ( metre * metre);

        System.out.print("Vücut kitle indeksiniz = " + index);

        System.out.println(' ');


        System.out.println("18.5 ve altı: Zayıf\n" +
                "18.5 - 24.9: Normal\n" +
                "25 - 29.9: Fazla kilolu\n" +
                "30 - 34.9: 1. derece obezite\n" +
                "35 - 39.9: 2. derece obezite\n" +
                "40 ve üstü: 3. derece obezite (morbid obezite)");

    }
}



/*Vücut Kitle İndeksi Hesaplama
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

Formül
Kilo (kg) / Boy(m) * Boy(m)

Çıktısı
Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
Lütfen kilonuzu giriniz : 105
Vücut Kitle İndeksiniz : 35.49215792320173*/



