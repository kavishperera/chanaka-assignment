package lk.chanaka_de_silva.Assignment.module;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "categories")
public class Category implements Serializable {

    @Id
    @Column(name = "categoryId", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoryId;

    @Basic
    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Basic
    @Column(name = "description", nullable = false, length = 50)
    private String description;

    @ManyToMany(mappedBy = "categories")
    private List<Product> products = new ArrayList<>();
}
