package com.badri.omniecom.omniecom.productcategories;

import javax.persistence.*;

@Entity
@SequenceGenerator(name="seq", initialValue=5)
@Table(name = "productCategories")
public class ProductCategories {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "seq")
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
