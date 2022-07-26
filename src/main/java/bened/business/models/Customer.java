package bened.business.models;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Data
@RequiredArgsConstructor
@Entity
@Table(name="customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_pk")
    private Integer id;
    private String name;
    private String street;
    private String zip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;
    private Integer orders;
    private String satisfaction;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}