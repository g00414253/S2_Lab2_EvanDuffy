public class OnlineOrderingSystem {
    public static void main(String[] args) {
        //Burger DB
        Burger cheeseBurger = new Burger();
        cheeseBurger.setName("Cheese Burger");
        cheeseBurger.setIngredients("Beef Burger,Cheese,Onion");
        cheeseBurger.setPrice(8.50);

        Burger PlainBurger = new Burger();
        PlainBurger.setName("Plain Burger");
        PlainBurger.setIngredients("Beef Burger,Ketchup");
        PlainBurger.setPrice(7.00);

        //Pizza DB
        Pizza CheesePizza = new Pizza();
        CheesePizza.setName("Cheese Pizza");
        CheesePizza.setIngredients("Cheese");
        CheesePizza.setPrice(10.50);

        Pizza HamPizza = new Pizza();
        HamPizza.setName("Ham Pizza");
        HamPizza.setIngredients("Ham,Cheese");
        HamPizza.setPrice(12.70);

        //Salad DB
        Salad CaesarSalad = new Salad();
        CaesarSalad.setName("Caesar Salad");
        CaesarSalad.setDescription("Croutons,Caesar Dressing");
        CaesarSalad.setPrice(9.90);

        //Dessert DB
        Dessert Icecream =new Dessert();
        Icecream.setName("Vanilla Icecream");
        Icecream.setDescription("Vanilla icecream with a flake and syrups");
        Icecream.setPrice(5.50);

        Dessert Cake = new Dessert();
        Cake.setName("Chocolate Cake");
        Cake.setDescription("Freshly Baked chocolate cake");
        Cake.setPrice(7.95);


        //Takes Specific food class and adds to an Array as MenuItems
        MenuItem[] menuItems= new MenuItem[]{
                cheeseBurger,PlainBurger,CheesePizza,HamPizza,CaesarSalad,Icecream,Cake
        };

        //Prints out toSting() for all the array Items
        for(MenuItem menuItem : menuItems) {
           System.out.println(menuItem.toString());
        }

        double totalCost=0;
        for(MenuItem menuItem : menuItems) {
            totalCost=totalCost+ menuItem.getPrice();
        }
        System.out.println("Total Cost:€" + totalCost);
        }
        }
