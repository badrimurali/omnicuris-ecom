package com.badri.omniecom.omniecom.products;

import com.badri.omniecom.omniecom.Response;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Controller
@RequestMapping(value = "/product")
public class ProductsController {

    @Autowired
    ProductsService productsService;

    @RequestMapping(value = "/saveOrEdit", method = RequestMethod.POST)
    public ResponseEntity<String> addProduct(
            @RequestBody Product product
    ) {
        Response response = new Response();
        try {
            productsService.saveOrEdit(product);
            response.setStatus(true);
            return ResponseEntity.ok().body(new Gson().toJson(response));
        } catch (Exception e) {
            response.setStatus(false);
            response.setErrorMessage(e.getMessage());
            return ResponseEntity.badRequest().body(new Gson().toJson(response));
        }
    }

    @RequestMapping(value = "/{productId}", method = RequestMethod.GET)
    public ResponseEntity<String> getProduct(
            @PathVariable Long productId
    ) {
        Response response = new Response();
        try {
            Product product = productsService.getProduct(productId);
            return ResponseEntity.ok().body(new Gson().toJson(product));
        } catch (EntityNotFoundException e) {
            response.setStatus(false);
            response.setErrorMessage(e.getMessage());
            return ResponseEntity.badRequest().body(new Gson().toJson(response));
        }
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResponseEntity<String> getAllProduct() {
        Response response = new Response();
        try {
            List<Product> products = productsService.getAllProducts();
            response.setStatus(true);
            return ResponseEntity.ok().body(new Gson().toJson(products));
        } catch (Exception e) {
            response.setStatus(false);
            response.setErrorMessage(e.getMessage());
            return ResponseEntity.badRequest().body(new Gson().toJson(response));
        }
    }

    @RequestMapping(value = "/{productId}", method = RequestMethod.DELETE)
    public ResponseEntity<String> deleteProduct(
            @PathVariable Long productId
    ) {
        Response response = new Response();
        try {
            productsService.deleteProduct(productId);
            response.setStatus(true);
            return ResponseEntity.ok().body(new Gson().toJson(response));
        } catch (Exception e) {
            response.setStatus(false);
            response.setErrorMessage(e.getMessage());
            return ResponseEntity.badRequest().body(new Gson().toJson(response));
        }
    }
}
