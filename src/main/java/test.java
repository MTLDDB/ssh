import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Product;
import service.ProductServiceImpl;

import java.util.List;

public class test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"WEB-INF/applicationContext.xml"});
        ProductServiceImpl productDAO=(ProductServiceImpl) context.getBean("productActionBean2");
//        Product product=new Product();
//        product.setName("jjj");
//        product.setPrice(5);
        List<Product> products= productDAO.list();
        for (Product p : products) {
            System.out.println(p.getName());
        }
    }
}