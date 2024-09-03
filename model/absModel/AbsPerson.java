package model.absModel;

public abstract class AbsPerson {
    public String name;
    private String contact;
    private String address;

    @Override
    public abstract String toString();
}
