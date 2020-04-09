package entity;

import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.*;

import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "sheet_music")
public class Music {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "musicid")
    private int musicId;

    @Column(name = "title")
    private String title;

    @Column(name = "composer")
    private String composer;

    @OneToMany(cascade = {CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.PERSIST,
            CascadeType.REFRESH})
    @JoinTable(name = "detail",
        joinColumns = @JoinColumn(name = "detailid"),
        inverseJoinColumns = @JoinColumn(name = "detailid"))
    @Column(name = "detailid")
    private List<Music> detailId;

    public Music() {
    }
}
