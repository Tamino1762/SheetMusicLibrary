package entity;

import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.*;

import lombok.Data;
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

    @Column(name = "detailid")
    private int detailId;
}
