// Soittimet
// App.java
// Kati Liukkonen
// Luokkien perityminen
// Visual Studio code, Java 21, Maven

package main;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("1) Lisää soitin");
            System.out.println("2) Listaa soittimet");
            System.out.println("3) Viritä kielisoittimet");
            System.out.println("4) Soita rumpuja");
            System.out.println("0) Lopeta ohjelma");

            if(sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch(i) {
                    case 1:
                        // Lisää soitin
                        break;
                    case 2:
                        // Listaa soittimet
                        break;
                    case 3:
                        // Viritä kielisoittimet
                        break;
                    case 4:
                        // Soita rumpuja
                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Syöte oli väärä.");
                        break;
                }

            }
        }

        
        
       
        sc.close();
    }

}
