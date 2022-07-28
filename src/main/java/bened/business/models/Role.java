package bened.business.models;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.Id;

@Data
@RequiredArgsConstructor
@Entity
@Table(name="app_role")
@Getter
@Setter
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="role_name")
    private String roleName;

    @Column(name="description")
    private String description;

    private static final long serialVersionUID = 1L;
}
