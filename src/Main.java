public class Main {
    public static void main(String[] args) {

        Product product = new Product(1, "Laptop", "Asus Laptop", 300, 2, 1);
        /*Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(500);
        product.setStockAmount(3);
        product.setGewicht(1.23);*/


        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.getCode());


    }
}
