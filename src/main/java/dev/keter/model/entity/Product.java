package dev.keter.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Data
@Table(name ="product")
public class Product {

    @Id
    @GeneratedValue
    @Column(name="product_id", nullable = false)
    private long productId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_img_url")
    private String productImgUrl;

    @Column(name = "product_price")
    private long productPrice;


}
