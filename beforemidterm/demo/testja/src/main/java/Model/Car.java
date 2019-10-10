package Model;
enum Type{
    Truck,
    MotorCycle
}

public class Car {
    public int id;
    private String color;
    private Type type;
    private int speed;
    private int displacement;
    private Boolean sunroof;

    public Car(int id, String color, Type type, int speed, int displacement, Boolean sunroof) {
        this.id = id;
        this.color = color;
        this.type = type;
        this.speed = speed;
        this.displacement = displacement;
        this.sunroof = sunroof;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public Boolean getSunroof() {
        return sunroof;
    }

    public void setSunroof(Boolean sunroof) {
        this.sunroof = sunroof;
    }

    public Car(Car car){
        this.id = car.id;
        this.color = car.color;
        this.type = car.type;
        this.speed = car.speed;
        this.displacement = car.displacement;
        this.sunroof = car.sunroof;
    }
}
