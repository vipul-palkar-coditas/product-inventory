package utility;

import domain.Product;

public class ProductUtility {

    public Product addProduct(Product product){
        Product productToSave = new Product();
        try {
            if (product != null) {
                if (product.getProductId() != null)
                    productToSave.setProductId(product.getProductId());

                if (product.getProductName() != null)
                    productToSave.setProductName(product.getProductName());

                if (product.getProductDescription() != null)
                    productToSave.setProductDescription(product.getProductDescription());

                if (product.getProductQuantity() != null)
                    productToSave.setProductQuantity(product.getProductQuantity());

                if (product.getProductPrice() != null)
                    productToSave.setProductQuantity(product.getProductQuantity());

            }
        }catch(Exception exception){
            System.out.println("Exception raised woth cause: "+exception.getCause());
        }
        return productToSave;
    }


}
