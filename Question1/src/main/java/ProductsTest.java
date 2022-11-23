import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductsTest {

    @Test
    void returnProduct() {
        Admin ad=new Admin();
        ad.addProducts("Suzuki","Vehicle","Bike",2,250000);
        ad.addProducts("Suzuki","Vehicle","Bike",4,250000);
        ad.addProducts("Suzuki","Vehicle","Bike",5,250000);
        Products pd=new Products();
        assertEquals(true,pd.returnProduct(2));
    }

    @Test
    void viewProducts() {
        Admin ad=new Admin();
        ad.addProducts("Suzuki","Vehicle","Bike",2,250000);
        ad.addProducts("Suzuki","Vehicle","Bike",4,250000);
        ad.addProducts("Suzuki","Vehicle","Bike",5,250000);
        Products pd=new Products();
        assertEquals(3,pd.viewProducts().size());
    }
}