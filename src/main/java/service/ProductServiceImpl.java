package service;

import dao.ProductDAO2;
import pojo.Product;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    ProductDAO2 productDAO;

    //@Transactional(propagation= Propagation.REQUIRED,rollbackForClassName="Exception")
    public List<Product> list() {
        List<Product> products= productDAO.list();
//       // if(products.isEmpty()){
//            for (int i = 0; i < 5; i++) {
//                if(i==2)
//                    throw new RuntimeException();
//                Product p = new Product();
//                p.setName("product " + i);
//                productDAO.add(p);
//                products.add(p);
//
//  //          }
//        }
        return products;
    }

    @Override
    public List<Product> getP(Class<Product> productClass, int id) {
        return productDAO.list();
    }
    @Override
    public void deleteP(Product p ) {
        productDAO.deleteP(p);
    }
    @Override
    public void add(Product product) {
        productDAO.add(product);
    }

    @Override
    public void updateP(Product product) {
        productDAO.updateP(product);
    }

    public ProductDAO2 getProductDAO() {
        return productDAO;
    }

    public void setProductDAO(ProductDAO2 productDAO) {
        this.productDAO = productDAO;
    }
}
