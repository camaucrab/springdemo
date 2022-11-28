package com.pdtdang.demospringboot.modals;

import org.springframework.data.mongodb.core.mapping.Document;


//import javax.persistence.Id;

@Document("customers")
public class MCustomer {
//    private String _id;

    private String name;
    private int quantity;
    private String category;

    public MCustomer(String name, int quantity, String category) {
        super();
        this.name = name;
        this.quantity = quantity;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
