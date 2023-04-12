package Magazine;

public class Notebook {
    private final int ram;
    private final int hdd;
    private final String os;
    private final String color;
    private int price;
    private String brand;

    public Notebook(int ram, int hdd, String os, String color) {
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }

    public int getHdd() {
        return hdd;
    }
    public int getRam() {
        return ram;
    }
    public String getOs() {
        return os;
    }
    public String getColor() {
        return color;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return String.format("Ноутбук %s {RAM: %s, HDD: %s, os: %s, color: %s, price: %s}", brand, ram, hdd, os, color, price);
    }
}