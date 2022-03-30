package Giris;
import java.util.Scanner;
public class OdevTaksimetre {
    public static void main(String[] args) {
        //Taksimetre KM başına 2.20 TL tutmaktadır.
        //Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        //Taksimetre açılış ücreti 10 TL'dir.
        Scanner input = new Scanner(System.in);
        System.out.print("kac kilometre yol gittiniz :");
        int inbin = 10;
        double km;
        km=input.nextDouble();
        double odenecektutar = (km*2.20)+ inbin ;
        //System.out.println("borcunuz:" + odenecektutar + "tl");
        //double kesinodeme = 20;
        double toplamborcunuz = (odenecektutar<20)?(20):(odenecektutar);
        System.out.print("toplamborcunuz=" + toplamborcunuz + "tl");







    }
}
