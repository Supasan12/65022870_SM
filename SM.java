 class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public double getPrice() {
        return price;
    }

   
    public void setPrice(double price) {
        this.price = price;
    }

    public static void main(String[] args) {
        Product product1 = new Product("chair", 500.0);
        System.out.println("Product name : " + product1.getName());
        System.out.println("Product Price : " + product1.getPrice());
        System.out.println();

        Product product2 = new Product("Television", 20000.0);
        System.out.println("Product Name: " + product2.getName());
        System.out.println("Product Price: " + product2.getPrice());
        System.out.println("Brand: Samsung");
        System.out.println("Model: Neo QLED");
        System.out.println("*");
        System.out.println();

        Product product3 = new Product("Iphone", 40000.0);
        System.out.println("Product Name: " + product3.getName());
        System.out.println("Product Price: " + product3.getPrice());
        System.out.println("Brand: Apple");
        System.out.println("Model: Iphone 99");
        System.out.println("Operating System: ios");
        System.out.println("*");
        System.out.println();

        Product product4 = new Product("OOP Programming", 250.0);
        System.out.println("Product Name: " + product4.getName());
        System.out.println("Product Price: " + product4.getPrice());
        System.out.println("Author: John Doe");
        System.out.println("Number of Pages: 300");
    }
}
