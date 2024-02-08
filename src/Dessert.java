public class Dessert implements MenuItem {
    private String name;
    private double price;
    private String Description;

    public Dessert(String name, double price, String description) {
        this.name = name;
        this.price = price;
        Description = description;
    }

    public Dessert() {
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    @Override
    public String toString() {
        return "Dessert{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", Description='" + Description + '\'' +
                '}';
    }
}
