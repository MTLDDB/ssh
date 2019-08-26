package action;

import pojo.Product;
import service.ProductService;

import java.util.List;

public class ProductAction2 {

    ProductService productService;
    List<Product> products;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    Product product;

    public String list() {
        //System.out.println(this);
        products = productService.list();
        return "listJsp";
    }
    public String edit() {
        //System.out.println(product.getId());
        List<Product> products =productService.getP(Product.class,product.getId());
        product=products.get(0);
        return "editJsp";
    }
    public String delete() {
        productService.deleteP(product);
        return "list";
    }
    public String add() {
       // System.out.println(product.getName());
        productService.add(product);
        return "list";
    }
    public  String update() {
        productService.updateP(product);
        return "list";
    }
    public ProductService getProductService() {
        return productService;
    }

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

}
