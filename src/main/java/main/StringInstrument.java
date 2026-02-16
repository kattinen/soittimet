// Soittimet
// StringInstrument.java
// Kati Liukkonen
// Luokkien perityminen
// Visual Studio code, Java 21, Maven

package main;

public class StringInstrument extends Instrument {

    public StringInstrument(String manufacturer, int price, int numberOfStrings) {
        super(manufacturer, price);
    }

    public void tune() {
        System.out.println("X soittimesta viritettiin Y kieltä");
    }
        
}
