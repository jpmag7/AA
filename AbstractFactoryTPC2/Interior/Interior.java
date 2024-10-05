package Interior;

public abstract class Interior{
    
    private String type;
    private Float price;
    private String color;

    public Interior(String type, Float price, String color){
        this.type = type;
        this.price = price;
        this.color = color;
    }

    public String getType(){
        return this.type;
    }

    public Float getPrice(){
        return this.price;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }
}