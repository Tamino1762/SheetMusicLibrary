package entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "publisher")
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "publisherid")
    private int publisherId;

    @Column(name="publisher")
    private String publisher;

    @Column(name = "publisher2")
    private String publisher2;

    @Column(name = "publisher3")
    private String publisher3;

    @Column(name = "publisher4")
    private String publisher4;

}
