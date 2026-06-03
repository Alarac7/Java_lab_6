import java.util.LinkedList;
import java.util.HashMap;
import java.util.Map;

class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Товар: " + name + " | Цена: " + price + " руб.";
    }
}

public class SalesTracker {
    private LinkedList<Item> soldItems;

    public SalesTracker() {
        soldItems = new LinkedList<>();
    }

    public void addSale(Item item) {
        soldItems.add(item);
        System.out.println("Продан: " + item.getName());
    }

    public void displaySales() {
        System.out.println("\n--- Список проданных товаров ---");
        if (soldItems.isEmpty()) {
            System.out.println("Продаж пока нет.");
            return;
        }
        for (Item item : soldItems) {
            System.out.println(item);
        }
    }

    public double calculateTotalSales() {
        double totalSum = 0;
        for (Item item : soldItems) {
            totalSum += item.getPrice();
        }
        return totalSum;
    }

    public String getMostPopularItem() {
        if (soldItems.isEmpty()) {
            return "Нет данных о продажах.";
        }

        Map<String, Integer> itemCounts = new HashMap<>();

        for (Item item : soldItems) {
            String name = item.getName();
            itemCounts.put(name, itemCounts.getOrDefault(name, 0) + 1);
        }

        String mostPopular = null;
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : itemCounts.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostPopular = entry.getKey();
            }
        }

        return mostPopular + " (продано раз: " + maxCount + ")";
    }

    static void main() {
        SalesTracker tracker = new SalesTracker();

        Item apple = new Item("Яблоко", 50.0);
        Item banana = new Item("Банан", 80.0);
        Item milk = new Item("Молоко", 90.0);

        tracker.addSale(apple);
        tracker.addSale(milk);
        tracker.addSale(banana);
        tracker.addSale(apple);
        tracker.addSale(apple);
        tracker.addSale(milk);

        tracker.displaySales();

        System.out.println("\nОбщая сумма продаж: " + tracker.calculateTotalSales() + " руб.");

        System.out.println("Наиболее популярный товар: " + tracker.getMostPopularItem());
    }
}
