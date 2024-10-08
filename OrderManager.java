
import java.util.Collections;
import java.util.List;

public class OrderManager {
    private List<Product>products;
    public OrderManager(List<Product> products) {
        this.products = products;
    }
    public void sortProducts() {
        Collections.sort(products, (p1, p2) -> {
            double totalPrice1 = p1.calculateTotalPrice();
            double totalPrice2 = p2.calculateTotalPrice();
            if (totalPrice1 != totalPrice2) {
                return Double.compare(totalPrice1, totalPrice2);}
            int nameComparison = p1.getName().compareTo(p2.getName());
            if (nameComparison != 0) {
                return nameComparison;}
            return Integer.compare(p1.getStockQuantity(), p2.getStockQuantity());
        });}
    public void displayProducts() {
        for (Product product : products) {
            System.out.println(product.getName() + "  Total Price:" + product.calculateTotalPrice() + " Stock: " + product.getStockQuantity());
        }}}

