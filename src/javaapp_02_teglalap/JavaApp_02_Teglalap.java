package javaapp_02_teglalap;

import java.io.IOException;
import java.util.Scanner;

public class JavaApp_02_Teglalap {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Kérem adja meg a téglalap egyik oldalát");
        double a = sc.nextDouble();
        System.out.println("Kérem adja meg a téglalap másik oldalát");
        double b = sc.nextDouble();
        
        System.out.println("Kérem adjon meg egy karaktert. (K - kerület, T - terület)");
        char c = (char) System.in.read();
        c = Character.toUpperCase(c);
        if (c == 'K') {
            System.out.println("Kerület: " + (2*(a+b)));
            Negyzet(a,b);
        }else if (c == 'T') {
            System.out.println("Terület: " + (a*b));
            Negyzet(a, b);
        }else{
            System.out.println("Hiba, nem értelmezett parancs");
        }
    }
    
    public static void Negyzet(double a, double b){
        if (a == b) {
            System.out.println("Ez egy négyzet");
        }
    }
    
}
