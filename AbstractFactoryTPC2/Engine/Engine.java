package Engine;

public abstract class Engine {

    private String name;
    private Float price;
    private Float weight;

    public Engine(String name, Float price, Float weight){
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName(){
        return this.name;
    }

    public Float getPrice(){
        return this.price;
    }

    public Float getWeight(){
        return this.weight;
    }
}
