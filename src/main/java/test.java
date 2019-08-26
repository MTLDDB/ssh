import dao.ProductDAOImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Product;
import service.ProductServiceImpl;

import java.util.List;

public class test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"applicationContext.xml"});
//        ProductServiceImpl productDAO=(ProductServiceImpl) context.getBean("productServiceImpl");
//        List<Product> products= productDAO.list();
//        for (Product p : products) {
//            productDAO.delete(p.getId());
//            System.out.println(p.getName());
//        }
//        List<Product> products1= productDAO.list();
//        for (Product p : products1) {
//            System.out.println(p.getName());
//        }
        ProductDAOImpl productDAO=(ProductDAOImpl) context.getBean("productDAOImpl");
        List<Product> products= productDAO.list();
        for (Product p : products) {
            productDAO.deleteP(p);
            System.out.println(p.getName());
        }
        List<Product> products1= productDAO.list();
        for (Product p : products1) {
            System.out.println(p.getName());
        }
    }
}