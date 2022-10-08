public class Main {
    public static void main(String[] args) {
        Product product = new Product(1, "Laptop", "Asus laptop", 3000, 2, "siyah");


        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());


    }
}