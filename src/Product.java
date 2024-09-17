// 상품 (부모 클래스)
public class Product implements Promotion {
    private String name;
    private int price;
    private int weight;

    public Product(String name, int price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public int getDiscountAmount() {
        return 0;
    }
}
