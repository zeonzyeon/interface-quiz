// 세부 상품들 (자식 클래스)
public class Beauty extends Product implements Promotion {
    public Beauty(String name, int price, int weight) {
        super(name, price, weight);
    }

    @Override
    public int getDiscountAmount() {
        return 10000;
    }
}
