package springboot.model;

import javax.persistence.*;

@Entity
@Table(name = "deparment")
public class Deparment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Deparment() {}
}
