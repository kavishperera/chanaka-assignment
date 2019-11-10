/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.chanaka_de_silva.Assignment.controller;

import java.util.List;
import lk.chanaka_de_silva.Assignment.module.Product;
import lk.chanaka_de_silva.Assignment.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author kavishmanjitha
 */
@RestController
@CrossOrigin
@RequestMapping("/api/assignment/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/get-all")
    public List<Product> getAll() {
        return productService.findAll();
    }

    @GetMapping("/find-one/{prodcutId}")
    public Product findOne(@PathVariable Integer prodcutId) {
        return productService.findOne(prodcutId);
    }

    @PostMapping("/save")
    public Product save(@RequestBody Product product) {
        return productService.save(product);
    }

    @DeleteMapping("/delete/{prodcutId}")
    public Integer delete(@PathVariable Integer prodcutId) {
        return productService.delete(prodcutId);
    }

}
