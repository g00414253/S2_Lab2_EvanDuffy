public class Pizza implements MenuItem{
    private String name;
    private double price;
    private String Description;

    public Pizza(String name, double price, String description) {
        this.name = name;
        this.price = price;
        Description = description;
    }

    public Pizza() {
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

    public void setIngredients(String Description) {
        this.Description = Description;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", Description='" + Description + '\'' +
                '}';
    }
}
