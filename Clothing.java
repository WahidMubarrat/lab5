public class Clothing  extends Product {
        private   double taxrate = 0.10;
        public Clothing(String name, int stockQuantity, double unitPrice) {
            super(name, stockQuantity, unitPrice);
        }
        @Override
        public double calculateTotalPrice() {
            return getUnitPrice()*(1+taxrate);}
    }

