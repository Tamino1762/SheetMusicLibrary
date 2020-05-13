package entity;

import lombok.Data;

import javax.persistence.*;


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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "detailid")
    private MusicDetail detail;


    public Music(String title, String composer) {
        this.title = title;
        this.composer = composer;
    }
    public Music(){

    }
}
