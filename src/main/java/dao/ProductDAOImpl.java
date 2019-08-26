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

}