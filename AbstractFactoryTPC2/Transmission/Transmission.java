package Transmission;

public abstract class Transmission {
    
    private String name;
    private Float price;
    private String type;

    public Transmission(String name, Float price, String type){
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public String getName(){
        return this.name;
    }

    public Float getPrice(){
        return this.price;
    }

    public String getType(){
        return this.type;
    }
}
