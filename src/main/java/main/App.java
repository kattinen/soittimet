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
                        System.out.println("Minkä soittimen haluat lisätä? 1) Kitara, 2) Viulu, 3) Rummut");
                        String instrumentType = sc.nextLine();
                        System.out.println("Anna valmistajan nimi:");
                        String manufacturer = sc.nextLine();
                        System.out.println("Anna hinta euroina:");
                        String priceInput = sc.nextLine();
                        int price = Integer.parseInt(priceInput);
                        if (instrumentType.equals("1")) {
                            int numberOfStrings = 6;
                            Guitar guitar = new Guitar(manufacturer, price, numberOfStrings);
                        } else if (instrumentType.equals("2")) {
                            int numberOfStrings = 4;
                            Violin violin = new Violin(manufacturer, price, numberOfStrings);
                        } else if (instrumentType.equals("3")) {
                            Drum drum = new Drum(manufacturer, price);
                        } else {
                            System.out.println("Syöte oli väärä.");
                        }
                        // Soitin on lisätty listaan!
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
