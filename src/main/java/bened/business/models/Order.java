package bened.business.models;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Data
@RequiredArgsConstructor
@Entity
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_pk")
    private Integer id;
    private Integer product;
    private Integer customer;
    private Integer quantity;
    private Boolean delivered;
}
