package service;

import dao.ProductDAO2;
import pojo.Product;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    ProductDAO2 productDAO;
    public List<Product> list() {
        List<Product> products= productDAO.list();
        if(products.isEmpty()){
            for (int i = 0; i < 5; i++) {
                Product p = new Product();
                p.setName("product " + i);
                productDAO.add(p);
                products.add(p);
            }
        }
        return products;
    }

    public ProductDAO2 getProductDAO() {
        return productDAO;
    }

    public void setProductDAO(ProductDAO2 productDAO) {
        this.productDAO = productDAO;
    }
}
