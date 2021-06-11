package devices;

import java.util.Objects;

public abstract class Car extends Device{
    public String price;

    public Car(String model, String producer, String price, Double value, int yearOfProduction) {
        this.model = model;
        this.producer = producer;
        this.price = price;
        this.value = value;
        this.yearOfProduction = yearOfProduction;
    }
    public void sell(Human seller, Human buyer, Double price, Car c){
        int i=0;
        int numer_z_gar_sprze=0;
        for(Car car:seller.getGarage()){
            if(car.equals(c)){
                i++;
                break;
            }
            numer_z_gar_sprze++;
        }
        if(i != 0){
            i=0;
            int numer_z_gar_kup=0;
            for(Car car: buyer.getGarage()){
                if(car == null){
                    i++;
                    break;
                }
                numer_z_gar_kup++;
            }
            if(i != 0){
                if(buyer.getCash() >= price){
                    buyer.setCash(buyer.getCash()-price);
                    seller.setCash((seller.getCash()+price));
                    buyer.setCar(seller.getCar(numer_z_gar_sprze), numer_z_gar_kup); // kupujacy jest wlascicielem
                    seller.setCar(null,numer_z_gar_sprze); // sprzedajacy sprzedal i nie ma auta
                    System.out.println("Samochod pomyslnie zakupiony przez kupujacego od sprzedajacego");
                }
                else{
                    System.out.println("Kupujacy nie ma tyle siana!");
                }
            }
            else{
                System.out.println("Brak miejsc u kupujacego w garazu");
            }
        }
        else{
            System.out.println("Sprzedajacy nie ma samochodu!");
        }
    }

    public  Double getValue()
    {
        return  this.value;
    }
    public  int getYearOfProduction()
    {
        return this.yearOfProduction;
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass())return false;
    Car auto = (Car) o;
    return Objects.equals(producer,auto.producer)&&Objects.equals(model,auto.model)&&Objects.equals(price,auto.price)&&Objects.equals(value,auto.value);
    }
    @Override
    public int hashCode() {
        return Objects.hash(producer, model, price, value);
    }

    public void turnOn(){
        System.out.println("Samochod zapalil.");
    }

    abstract public void refuel();
}