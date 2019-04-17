package com.badri.omniecom.omniecom.productcategories;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductCategories {
    @Id
    private Long id;
    private String categoryName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
