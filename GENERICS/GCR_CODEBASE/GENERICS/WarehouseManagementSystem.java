import java.util.ArrayList;
import java.util.List;

abstract class WarehouseItem {
    private String name;
    private double price;

    public WarehouseItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
}

class Electronics extends WarehouseItem {
    private int warrantyPeriod;

    public Electronics(String name, double price, int warrantyPeriod) {
        super(name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    public int getWarrantyPeriod() { return warrantyPeriod; }
}

class Groceries extends WarehouseItem {
    private String expiryDate;

    public Groceries(String name, double price, String expiryDate) {
        super(name, price);
        this.expiryDate = expiryDate;
    }

    public String getExpiryDate() { return expiryDate; }
}

class Furniture extends WarehouseItem {
    private String material;

    public Furniture(String name, double price, String material) {
        super(name, price);
        this.material = material;
    }

    public String getMaterial() { return material; }
}

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public T getItem(int index) {
        return items.get(index);
    }

    public List<T> getAllItems() {
        return items;
    }

    public int getCount() {
        return items.size();
    }
}

public class WarehouseManagementSystem {
    public static void displayAllItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println("Item: " + item.getName() + ", Price: $" + item.getPrice());
        }
    }

    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop", 999.99, 24));
        electronicsStorage.addItem(new Electronics("Phone", 699.99, 12));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Apple", 0.99, "2026-07-15"));
        groceriesStorage.addItem(new Groceries("Milk", 2.99, "2026-07-10"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Table", 149.99, "Wood"));
        furnitureStorage.addItem(new Furniture("Chair", 89.99, "Metal"));

        System.out.println("--- Electronics ---");
        displayAllItems(electronicsStorage.getAllItems());

        System.out.println("--- Groceries ---");
        displayAllItems(groceriesStorage.getAllItems());

        System.out.println("--- Furniture ---");
        displayAllItems(furnitureStorage.getAllItems());

        List<WarehouseItem> allItems = new ArrayList<>();
        allItems.addAll(electronicsStorage.getAllItems());
        allItems.addAll(groceriesStorage.getAllItems());
        allItems.addAll(furnitureStorage.getAllItems());

        System.out.println("--- All Items (Wildcard) ---");
        displayAllItems(allItems);
    }
}
