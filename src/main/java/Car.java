public class Car {

    private String name;
    private Integer price;
    private String colour;

    public Car(String name, int price, String colour) {
        this.name = name;
        this.price = price;
        this.colour = colour;

    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }
}
