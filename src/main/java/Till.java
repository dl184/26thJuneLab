public class Till {

    private Integer tillFloat;
    private String car;



    public Till(Integer tillFloat) {
        this.tillFloat = tillFloat;
        this.car = car;
    }


    public int getCount() {
        return this.tillFloat;


    }

    public int addToTill(Car car) {
        tillFloat = tillFloat += car.getPrice();
        return this.tillFloat;

    }
}
