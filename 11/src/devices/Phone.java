package devices;

import java.net.URL;
import java.util.ArrayList;

public class Phone extends Device {
    String System;
    private static final String adres = "www.dobreprogramy.pl/combofix,program,windows,6628678494627457";
    private static final int port = 8080;
    private static final String wersja = "19.11.4.1";
    
    public Phone(String model, String producer, int yearOfProduction, String system) {
        this.System = system;
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
    }

    public void turnOn(){
        java.lang.System.out.println("Telefon wlaczyl sie!");
    }

    public void sell1(Human seller, Human buyer, Double price){
        if(seller.getTelephone() != null){
            if(buyer.getCash() >= price){
                buyer.setCash(buyer.getCash()-price);
                seller.setCash((seller.getCash()+price));
                buyer.setTelephone(seller.getTelephone());
                seller.setTelephone(null);

                java.lang.System.out.println("Telefon pomyslnie zakupiony przez kupujacego od sprzedajacego");
            }
            else{
                java.lang.System.out.println("Kupujacy nie ma tyle siana!");
            }
        }
        else{
            java.lang.System.out.println("Sprzedajacy nie ma samochodu!");
        }
    }

    public void installAnnApp(String nazwa){
        java.lang.System.out.println("Zainstalowano aplikacje " + nazwa);
    }
    public void installAnnApp(String nazwa, String wersja){
        java.lang.System.out.println("Zainstalowano aplikacje " + nazwa + " w wersji " + wersja);
    }
    public void installAnnApp(String nazwa, String wersja, String adres){
        java.lang.System.out.println("Zainstalowano aplikacje " + nazwa + " w wersji " + wersja + " z adresu " + adres);
    }
    public void installAnnApp(ArrayList<String> lista){
        java.lang.System.out.println("Zainstalowano nastepujace aplikacje :");
        for(String apka: lista){
            java.lang.System.out.println(apka);
        }
    }
    public void installAnnApp(URL url){
        java.lang.System.out.println("Zainstalowano aplikacje z adresu URL prowadzacego do konkretnej aplikacji z konkretna wersja");
    }

    @Override
    public String toString() {
            String x = "Model: " + this.model + ";" +
                    "Producent: " + this.producer + ";" +
                    "Cena: " + this.System + ";" +
                    "Rok produkcji: " + this.yearOfProduction;
            return x;
        }

    @Override
    public void sell(Human seller, Human buyer, Double price, Car c) {

    }
}