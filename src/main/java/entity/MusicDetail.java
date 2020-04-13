package entity;

import lombok.Data;

import javax.persistence.*;
import javax.sound.midi.Instrument;
import java.util.List;

@Data
@Entity
@Table(name = "detail")
public class MusicDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "detailid")
    private int detailId;

    @ManyToOne(cascade = {CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.PERSIST,
            CascadeType.REFRESH})
    @JoinTable(name = "sheet_music",
               joinColumns = @JoinColumn(name = "musicid"),
                inverseJoinColumns = @JoinColumn(name = "musicid"))
    @Column(name = "musicid")
    private Music musicId;

    @OneToOne(cascade = {CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.PERSIST,
            CascadeType.REFRESH})
    @JoinTable(name = "format",
            joinColumns = @JoinColumn(name = "formatid"),
            inverseJoinColumns = @JoinColumn(name = "formatid"))
    @Column(name = "formatid")
    private Format formatId;

    @OneToOne(cascade = {CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.PERSIST,
            CascadeType.REFRESH})
    @JoinTable(name = "instrument",
            joinColumns = @JoinColumn(name = "instrumentid"),
            inverseJoinColumns = @JoinColumn(name = "instrumentid"))
    @Column(name = "instrumentid")
    private MusicInstrument instrumentId;

    @ManyToMany(cascade = {CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.PERSIST,
            CascadeType.REFRESH})
    @JoinTable(name = "publisher",
            joinColumns = @JoinColumn(name = "publisherid"),
            inverseJoinColumns = @JoinColumn(name = "publisherid"))
    @Column(name = "publisherid")
    private List<Publisher> publisherId;

    @Column(name = "difficulty")
    private String difficulty;

    @Column(name = "editor")
    private String editor;

    public int getDetailId() {
        return detailId;
    }

    public void setDetailId(int detailId) {
        this.detailId = detailId;
    }

    public Music getMusicId() {
        return musicId;
    }

    public void setMusicId(Music musicId) {
        this.musicId = musicId;
    }

    public Format getFormatId() {
        return formatId;
    }

    public void setFormatId(Format formatId) {
        this.formatId = formatId;
    }

    public MusicInstrument getInstrumentId() {
        return instrumentId;
    }

    public void setInstrumentId(MusicInstrument instrumentId) {
        this.instrumentId = instrumentId;
    }

    public List<Publisher> getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(List<Publisher> publisherId) {
        this.publisherId = publisherId;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public MusicDetail() {
    }
}
