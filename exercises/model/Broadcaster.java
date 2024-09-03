package model;

public class Broadcaster {
    private String name;

    public Broadcaster(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Broadcaster{" +
                "name='" + name + '\'' +
                '}';
    }
}
