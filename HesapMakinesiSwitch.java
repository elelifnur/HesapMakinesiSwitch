import java.util.Scanner;
public class HesapMakinesiSwitch {
    public static void  main(String[] args){
        int n1,n2,select;

        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı girinizi: ");
        n1=input.nextInt();
        System.out.print("İlk sayıyı girinizi: ");
        n2=input.nextInt();

        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n------------------\nYapmak İstediğiniz İşlemi Seçiniz: ");
        select=input.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplama: "+(n1+n2));
                break;
            case 2:
                System.out.println("Çıkartma: "+(n1-n2));
                break;
            case 3:
                System.out.println("Çarpma: "+(n1*n2));
                break;
            case 4:
                if(n2 != 0) {
                    System.out.println("Bölme: " + (n1 / n2));
                    break;
                }else{
                    System.out.println("Bir sayı 0'a bölünemez!");
                }
            default:
                System.out.println("Yanlış seçim yaptınız. Tekrar deneyin.");
        }
    }
}
