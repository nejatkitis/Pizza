import java.util.Scanner;

public class Pizza {
    public static void main(String[] args) {
        double d,r,pi,aci,alan,cevre,a2,dilim;
        pi =3.14;
        System.out.println("Hangi büyüklükte pizza istersiniz ?");
        Scanner cap = new Scanner(System.in);
        d = cap.nextDouble();
        r = d/2;
        System.out.println("Pizzanızı kaç dilime bölelim ?");
        Scanner kac = new Scanner(System.in);
        dilim = kac.nextDouble();
        aci = 360/dilim;
        alan = pi*r*r;
        cevre = pi*d;
        a2 = (alan*aci)/360;
        System.out.println("Pizzanızın alanı : " +alan);
        System.out.println("Pizzanızın çevresi : " +cevre);
        System.out.println("Bir dilim pizzanın alanı : "+a2);
    }
}
