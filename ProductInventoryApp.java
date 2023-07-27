import domain.Product;
import utility.ProductUtility;

public class ProductInventoryApp {

    public static void main(String[] args){

        Product sampleProductToSave = new Product();
        sampleProductToSave.setProductId("101");
        sampleProductToSave.setProductName("Laptop");
        sampleProductToSave.setProductDescription("Portable computer");
        sampleProductToSave.setProductPrice(300000F);
        sampleProductToSave.setProductQuantity(1);


        ProductUtility productUtility = new ProductUtility();
        Product savedProduct = productUtility.addProduct(sampleProductToSave);

        System.out.println("Saved product is: "+ savedProduct);
    }
}
