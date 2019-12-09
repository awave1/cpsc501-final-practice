package data;

public class Car implements Drivable {
    public String name;
    private Person driver;

    public void setName(String name) {
        this.name = name;
    }

    public void setDriver(Person driver) {
        this.driver = driver;
    }

    @Override
    public void drive() {
        System.out.println("choo choo mf");
    }
}
