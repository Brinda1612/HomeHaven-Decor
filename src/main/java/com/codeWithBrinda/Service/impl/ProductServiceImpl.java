package com.codeWithBrinda.Service.impl;

import com.codeWithBrinda.entities.Product;
import com.codeWithBrinda.entities.User;
import com.codeWithBrinda.exception.ResouecenotfoundException;
import com.codeWithBrinda.Repo.ProductRepo;
import com.codeWithBrinda.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepo productRepo;


    @Override
    public Product save(Product product) {
        return productRepo.save(product);
    }

    @Override
    public Product getContactById(int id) {
        return productRepo.findById(id).orElseThrow(()-> new ResouecenotfoundException("contact id" ,"id" ,id));
    }


    @Override
    public List<Product> getAllProduct() {
        return productRepo.findAll();
    }

    @Override
    public void deleteProduct(int id) {

    }

    @Override
    public Product updateProduct(Product product, int id) {
        return null;
    }

    @Override
    public List<Product> getProductByUserId(int userId) {
        return productRepo.findByUserId(userId);
    }

    @Override
    public List<Product> getByUser(User user) {

        return productRepo.findByUser(user);
    }
}

