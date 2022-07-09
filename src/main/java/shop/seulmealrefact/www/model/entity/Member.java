package shop.seulmealrefact.www.model.entity;

import lombok.Builder;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@ToString
@Builder
public class Member {
    @Id
    @GeneratedValue
    private int no;
    @Column(unique = true,nullable = false)
    private String userId;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String email;
}
