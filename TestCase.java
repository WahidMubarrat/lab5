
    import org.junit.Test;
    import java.util.ArrayList;
    import java.util.Collections;
    import java.util.Comparator;
    import java.util.List;
    import static org.junit.Assert.*;
  public class TestCase {
        @Test
        public void testTotalPriceofElectronics() {
            Product mobile = new Electronics("Mobile", 10, 5000);
            assertEquals(5750.0, mobile.calculateTotalPrice(),.01);}
        @Test
        public void testTotalPriceofClothing() {
            Product shirt = new Clothing("Shirt", 50, 200);
            assertEquals(220.0, shirt.calculateTotalPrice(),.01);}
        @Test
        public void testTotalPriceofFurnituress() {
            Product chair = new Furniture("Chair", 100, 500);
            assertEquals(540.0,chair.calculateTotalPrice(),.01);
        }}
