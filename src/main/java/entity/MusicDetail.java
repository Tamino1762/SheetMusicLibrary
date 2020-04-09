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
}
