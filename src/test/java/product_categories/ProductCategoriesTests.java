package product_categories;

import base.BaseTests;
import org.testng.annotations.Test;

public class ProductCategoriesTests extends BaseTests {
@Test
    public void  testProductCategory() throws InterruptedException {
    String category1 = "Phone";
    String category2 = "Laptop";
    String category3 = "Monitor";
    homePage.productCategory.clickProductCategory(category3.toUpperCase());
}
}
