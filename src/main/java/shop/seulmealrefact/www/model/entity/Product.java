package shop.seulmealrefact.www.model.entity;

import org.springframework.context.annotation.Primary;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue
    private int no;

    private String name;
    private int price;
    private String thumbnailName;
}
