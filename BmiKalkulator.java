
package metodusgyak;

import java.util.Scanner;


public class BmiKalkulator {
    static int tomeg = beker("Testtömeg (kg) [40; 150]");
    static int mag = beker("Testmagasság (cm) [100; 200]");
    static double bmiIndex = bmi();
    public static void main(String[] args) {
        kiir("BMI index kiszámítása");
        ertekeles();
    }
    private static void kiir(String szoveg) {
        System.out.println(szoveg);
    }

    private static int beker(String bekerSzoveg) {
        System.out.print(bekerSzoveg+" ");
        Scanner sc = new Scanner(System.in);
        int bekertAdat = sc.nextInt();
        return bekertAdat;
    }

    private static double bmi() {
        return tomeg/Math.pow(mag/100.0, 2);
    }

    private static void ertekeles() {
        System.out.printf("Ön %d cm magas és %d kg tömegű, "
                + "így BMI indexe %.2f.\n ", mag, tomeg, bmiIndex);
                /*"Tehát Ön túlsúlyos testalkatú"*/

    }
}
