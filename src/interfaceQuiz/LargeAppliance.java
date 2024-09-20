package interfaceQuiz;

// 세부 상품들 (자식 클래스)
public class LargeAppliance extends Product implements Promotion {
    public LargeAppliance(String name, int price, int weight) {
        super(name, price, weight);
    }

    @Override
    public int getDiscountAmount() {
        return 0;
    }
}

