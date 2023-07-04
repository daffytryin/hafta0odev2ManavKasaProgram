import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlican=5.00; //soruda verilmiş birim değerler
        int alinanArmut, alinanElma, alinanDomates, alinanMuz, alinanPatlican; //kullanıcıdan alınacak değerler
        Scanner input = new Scanner(System.in);
        System.out.println("Armut kaç kilo? :");
        alinanArmut = input.nextInt();
        System.out.println("Elma kaç kilo? :");
        alinanElma = input.nextInt();
        System.out.println("Domates kaç kilo? :");
        alinanDomates = input.nextInt();
        System.out.println("Muz kaç kilo? :");
        alinanMuz = input.nextInt();
        System.out.println("Patlıcan kaç kilo? :");
        alinanPatlican = input.nextInt();

        double toplam; //toplam tutar için gerekli formül
        toplam = armut*alinanArmut + elma*alinanElma + domates*alinanDomates + muz*alinanMuz + patlican*alinanPatlican;

        System.out.println("Toplam Tutar :" +toplam); //formül ile hesaplanan sonuç
    }
}