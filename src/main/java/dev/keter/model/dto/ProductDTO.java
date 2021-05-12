package dev.keter.model.dto;

import lombok.Data;

@Data
public class ProductDTO {
    private String productId;
    private String productName;
    private String productImgUrl;
    private Double productPrice;
}
