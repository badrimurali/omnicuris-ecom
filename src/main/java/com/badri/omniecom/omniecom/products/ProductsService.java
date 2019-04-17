package com.badri.omniecom.omniecom.products;

import com.badri.omniecom.omniecom.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class ProductsService {

    @Autowired
    private ProductRepository productRepository;

    public Product getProduct(Long productId) {
        return productRepository.findById(productId).orElseThrow(() -> new EntityNotFoundException("Invalid Product Code"));
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public void saveOrEdit(Product newProduct) {
        Product product = null;
        if (newProduct.getId() != null) {
            product = productRepository.findById(newProduct.getId()).orElseThrow(() -> new EntityNotFoundException("Invalid Product Code"));
        }
        else if (newProduct.getName() != null) {
            product = productRepository.findByName(newProduct.getName());
        }

        if (product == null) {
            product = newProduct;
        } else {
            product.setName(newProduct.getName());
            product.setPrice(newProduct.getPrice());
            product.setStock(newProduct.getStock());
            product.setMerchant(newProduct.getMerchant());
            product.setAddressLine(newProduct.getAddressLine());
            product.setAddressPincode(newProduct.getAddressPincode());
            product.setCategoryId(newProduct.getCategoryId());
        }
        productRepository.save(product);
    }

    public void deleteProduct(Long productId) {
        productRepository.deleteById(productId);
    }
}
