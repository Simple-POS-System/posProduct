package com.ead.posproduct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public ResponseEntity<?> addUser(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @GetMapping("/getAll")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/getById/{productId}")
    public ResponseEntity<?> getProductById(@PathVariable String productId){
        try{
            return ResponseEntity.ok(productService.getProductById(productId));
        }catch (ProductNotFountException e){
            return null;
        }
    }

    @PutMapping("/update/{productId}")
    public ResponseEntity<String> updateProduct(@PathVariable String productId, @RequestBody Product product){
        try {
            return productService.updateProduct(productId, product);
        }catch (ProductNotFountException e){
            return ResponseEntity.ok(e.getMessage());
        }
    }

    @DeleteMapping("/delete/{productId}")
    public ResponseEntity<String> deleteProduct(@PathVariable String productId){
        try {
            return productService.deleteProduct(productId);
        }catch (ProductNotFountException e){
            return ResponseEntity.ok(e.getMessage());
        }
    }
}
