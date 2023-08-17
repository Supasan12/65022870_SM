class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    String getName() {
        return name;
    }

     void setName(String name) {
        this.name = name;
    }

     double getPrice() {
        return price;
    }

     void setPrice(double price) {
        this.price = price;
    }
}

class Electronics extends Product {
    private String brand;
    private String model;

    public Electronics(String name, double price, String brand, String model) {
        super(name, price);
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

class Phone extends Electronics {
    private String operatingSystem;

    public Phone(String name, double price, String brand, String model, String operatingSystem) {
        super(name, price, brand, model);
        this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}

class Book extends Product {
    private String author;
    private int numberOfPages;

    public Book(String name, double price, String author, int numberOfPages) {
        super(name, price);
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}

 class Main {
    public static void main(String[] args) {
        Product chair = new Product("chair", 500.0);
        Electronics tv = new Electronics("Television", 20000.0, "SumSung", "Neo QLED");
        Phone iphone = new Phone("Iphone", 40000.0, "Apple", "Iphone99", "ios");
        Book book = new Book("OOP Programming", 250.0, "John Doe", 300);

        System.out.println("Product Name: " + chair.getName());
        System.out.println("Product Price: " + chair.getPrice());
        System.out.println("************************");
        System.out.println("Product Name: " + tv.getName());
        System.out.println("Product Price: " + tv.getPrice());
        System.out.println("Brand: " + tv.getBrand());
        System.out.println("Model: " + tv.getModel());
        System.out.println("************************");
        System.out.println("Product Name: " + iphone.getName());
        System.out.println("Product Price: " + iphone.getPrice());
        System.out.println("Brand: " + iphone.getBrand());
        System.out.println("Model: " + iphone.getModel());
        System.out.println("Operating System: " + iphone.getOperatingSystem());
        System.out.println("************************");
        System.out.println("Product Name: " + book.getName());
        System.out.println("Product Price: " + book.getPrice());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Number of Pages: " + book.getNumberOfPages());
    }
}