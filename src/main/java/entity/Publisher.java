package entity;

import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

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
}
