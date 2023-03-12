public class Product {

    public Product(int id, String name, String description, double price, int stockAmount, int gewicht){
        System.out.println("Constructor läuft");
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
        this.gewicht = gewicht;
    }
    public Product(){

    }

    // attribute | field
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private double gewicht;
    private String code;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public String getCode() {
        return this.name.substring(0, 1) + id;
    }


}
