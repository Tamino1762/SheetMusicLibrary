package entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "detail")
public class MusicDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "detailid")
    private int detailId;

    @Column(name = "musicid")
    private int musicId;

    @Column(name = "formatid")
    private int formatId;

    @Column(name = "instrumentid")
    private int instrumentId;

    @Column(name = "publisherid")
    private int publisherId;

    @Column(name = "difficulty")
    private String difficulty;

    @Column(name = "editor")
    private String editor;
}
