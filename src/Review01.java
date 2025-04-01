
public class Review01 {

    public static void main(String[] args) {
        int price = 1500;
        int tax = tax(price);
        int total = price + tax;
        System.out.printf(price + "円の商品の税込み価格は" + total + "円(消費税は"+ tax + "円)です。");
    }

    static int tax(int price) {
        return price * 10 / 100;
    }
}
