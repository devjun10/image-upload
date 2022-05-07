package com.example.imageupload.domain.image;

import com.example.imageupload.domain.product.Product;
import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Image {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long imageId;
    private String imageUrl;
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;

    public Image(String imageUrl, String name, Product product) {
        this.imageUrl = imageUrl;
        this.name = name;
        this.product = product;
    }

    protected Image (){};
}
