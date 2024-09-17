// 장바구니
// 배송비를 계산하는 메소드만 구현
public class Cart {
    private Product[] products;

    public Cart(Product[] products) {
        this.products = products;
    }

    public int calculateDeliveryCharge() {
        int totalWeight = 0;
        int totalPrice = 0;
        int totalDiscount = 0;
        int deliveryCharge = 0;

        for (Product product : products) {
            totalWeight += product.getWeight();
            totalPrice += product.getPrice();
            totalDiscount += product.getDiscountAmount();
        }

        // 무게에 따른 배송비 계산
        if (totalWeight < 3) {
            deliveryCharge = 1000;
        } else if (totalWeight < 10) {
            deliveryCharge = 5000;
        } else {
            deliveryCharge = 10000;
        }

        totalPrice -= totalDiscount;

        // 가격에 따른 배송비 조정
        if (totalPrice >= 30000 && totalPrice < 100000) {
            deliveryCharge -= 1000;
        } else if (totalPrice >= 100000) {
            deliveryCharge = 0;
        }

        return deliveryCharge;
    }
}
