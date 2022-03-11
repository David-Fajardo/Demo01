package academy.digital.demo01.controller;


import academy.digital.demo01.model1.Products;
import academy.digital.demo01.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/products")

public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public Products getProduct(){

        return productService.getModel();


    }


}
