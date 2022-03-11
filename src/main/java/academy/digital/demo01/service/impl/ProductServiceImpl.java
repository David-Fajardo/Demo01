package academy.digital.demo01.service.impl;

import academy.digital.demo01.model1.Products;
import academy.digital.demo01.service.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Override
    public Products getModel() {

        Products products=new Products();
        products.setCellphone("SmartPhone");
        products.setBrand("Xiaomi");
        products.setModel("Redmi 10 pro");
        products.setCountry("China");
        return  products;

    }

}
