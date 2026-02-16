// Soittimet
// App.java
// Kati Liukkonen
// Luokkien perityminen
// Visual Studio code, Java 21, Maven

package main;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        ArrayList<Instrument> Instruments = new ArrayList<>();

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
                        String typeString = sc.nextLine();
                        int type = Integer.parseInt(typeString);
                        System.out.println("Anna valmistajan nimi:");
                        String manufacturer = sc.nextLine();
                        System.out.println("Anna hinta euroina:");
                        String priceInput = sc.nextLine();
                        int price = Integer.parseInt(priceInput);
                        if (type == 1) {
                            Guitar guitar = new Guitar(manufacturer, price);
                            Instruments.add(guitar);
                            System.out.println("Soitin lisätty listaan!");
                        } else if (type == 2) {
                            Violin violin = new Violin(manufacturer, price);
                            Instruments.add(violin);
                            System.out.println("Soitin lisätty listaan!");
                        } else if (type == 3) {
                            Drum drum = new Drum(manufacturer, price);
                            Instruments.add(drum);
                            System.out.println("Soitin lisätty listaan!");
                        } else {
                            System.out.println("Virheellinen soitinvalinta.");
                        }
                        break;
                    case 2:
                        if (Instruments.size() == 0)  {
                            System.out.println("Ei lisättyjä soittimia.");
                        } else {
                            for (Instrument instrument : Instruments) {
                                System.out.println(instrument.getDetails());
                            }
                        }
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
