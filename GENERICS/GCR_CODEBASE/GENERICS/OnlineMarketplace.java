import java.util.ArrayList;
import java.util.List;

interface Category {}

class BookCategory implements Category {
    private String genre;
    public BookCategory(String genre) { this.genre = genre; }
    public String getGenre() { return genre; }
    public String toString() { return "Book [" + genre + "]"; }
}

class ClothingCategory implements Category {
    private String size;
    public ClothingCategory(String size) { this.size = size; }
    public String getSize() { return size; }
    public String toString() { return "Clothing [" + size + "]"; }
}

class GadgetCategory implements Category {
    private String brand;
    public GadgetCategory(String brand) { this.brand = brand; }
    public String getBrand() { return brand; }
    public String toString() { return "Gadget [" + brand + "]"; }
}

class Product<T extends Category> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public T getCategory() { return category; }
    public void setPrice(double price) { this.price = price; }

    public String toString() {
        return name + " ($" + price + ") - " + category;
    }
}

public class OnlineMarketplace {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discount = product.getPrice() * (percentage / 100);
        product.setPrice(product.getPrice() - discount);
        System.out.println("Applied " + percentage + "% discount. New price: $" + product.getPrice());
    }

    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Basics", 39.99, new BookCategory("Education"));
        Product<ClothingCategory> shirt = new Product<>("Cotton Shirt", 29.99, new ClothingCategory("M"));
        Product<GadgetCategory> phone = new Product<>("Smartphone", 799.99, new GadgetCategory("TechBrand"));

        List<Product<?>> catalog = new ArrayList<>();
        catalog.add(book);
        catalog.add(shirt);
        catalog.add(phone);

        System.out.println("--- Catalog Before Discount ---");
        for (Product<?> p : catalog) {
            System.out.println(p);
        }

        System.out.println("\n--- Applying Discounts ---");
        applyDiscount(book, 10);
        applyDiscount(shirt, 20);
        applyDiscount(phone, 5);

        System.out.println("\n--- Catalog After Discount ---");
        for (Product<?> p : catalog) {
            System.out.println(p);
        }
    }
}
