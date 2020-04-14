package entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "format")
public class Format {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "formatid")
    private int formatId;

    @Column(name = "type")
    private String type;

}
