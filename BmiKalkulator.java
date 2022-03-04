
package metodusgyak;

import java.util.Scanner;


public class BmiKalkulator {
    static int tomeg = beker("Testtömeg (kg) [40; 150]", 40, 150);
    static int mag = beker("Testmagasság (cm) [100; 200]", 100, 200);
    static double bmiIndex = bmi();
    public static void main(String[] args) {
        kiir("BMI index kiszámítása");
        ertekeles();
    }
    private static void kiir(String szoveg) {
        System.out.println(szoveg);
    }

    private static int beker(String bekerSzoveg, int also, int felso) {
        System.out.print(bekerSzoveg);
        
        Scanner sc = new Scanner(System.in);
        int ertek=-1;
        boolean jo=false;
        while (!jo) {
            ertek=sc.nextInt();
            jo=ertek>=also && ertek<=felso;
            if (!jo) {
                System.out.println("Nem jó, újra!");
                System.out.println(bekerSzoveg);
            }
        }
        return ertek;
    }

    private static double bmi() {
        return tomeg/Math.pow(mag/100.0, 2);
    }

    private static void ertekeles() {
        String eredmenyAlapjan="kórosan sovány";
        if (bmiIndex>20 && bmiIndex<25) {
            eredmenyAlapjan="normál";
        }else if (bmiIndex>25 && bmiIndex<30) {
            eredmenyAlapjan="túlsúlyos";
        }else if (bmiIndex>30 && bmiIndex<35) {
            eredmenyAlapjan="elhízott";
        }else if (bmiIndex>35) {
            eredmenyAlapjan="károsan elhízott";
        }
        System.out.printf("Ön %d cm magas és %d kg tömegű, "
                + "így BMI indexe %.2f. %s\n ", mag, tomeg, bmiIndex, eredmenyAlapjan);

    }
}
