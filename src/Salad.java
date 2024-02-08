public class Salad implements MenuItem{
    private String name;
    private double price;
    private String Description;

    public Salad(String name, double price, String description) {
        this.name = name;
        this.price = price;
        Description = description;
    }

    public Salad() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return Description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    @Override
    public String toString() {
        return "Salad{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", Description='" + Description + '\'' +
                '}';
    }
}
