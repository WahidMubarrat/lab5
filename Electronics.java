public class Electronics  extends Product  {
        private  double taxrate = 0.15;
        public Electronics(String name, int stockQuantity, double unitPrice) {
            super(name, stockQuantity, unitPrice);
        }
        @Override
        public double calculateTotalPrice() {
            return getUnitPrice()*(1+taxrate);}
    }

