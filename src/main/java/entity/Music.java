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

    public int getMusicId() {
        return musicId;
    }

    public void setMusicId(int musicId) {
        this.musicId = musicId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public void setType(String string) {
    }

    public void setDifficulty(String string) {
    }
}
