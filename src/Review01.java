
public class Review01 {

    public static void main(String[] args) {
        int tax_excluding = 1500;
        double tax_rate = 0.1;
        int tax_amount = tax(tax_excluding, tax_rate);
        int tax_including = tax_excluding + tax_amount;
        System.out.println(tax_excluding + "円の商品の税込価格は" + tax_including + "円（消費税は" + tax_amount + "円)です");

    }
    public static int tax(int tax_excluding, double tax_rate) {
        int tax_amount = (int)(tax_excluding * tax_rate);
        return tax_amount;

    }

}
