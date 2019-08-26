package dao;

import org.springframework.orm.hibernate3.HibernateTemplate;
import pojo.Product;

import java.util.List;

public class ProductDAOImpl extends HibernateTemplate implements ProductDAO2{

    public List<Product> list() {
        return find("from Product");
    }

    @Override
    public void add(Product p) {
        save(p);
    }

    @Override
    public Product getP(Class<Product> productClass, int id) {
        return (Product)get(productClass,id);
    }

    @Override
    public void deleteP(Product p) {
        delete(p);
    }

    @Override
    public void updateP(Product p) {
        update(p);
    }


}