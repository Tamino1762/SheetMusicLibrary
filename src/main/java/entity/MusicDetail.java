package entity;

import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import javax.sound.midi.Instrument;

@Service
@Controller
@Entity
@Table(name = "detail")
public class MusicDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "detailid")
    private int detailId;

  @OneToOne(mappedBy = "detail", cascade = CascadeType.ALL)
    private Music music;

    @ManyToOne(cascade = {CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.PERSIST,
            CascadeType.REFRESH})
    @JoinColumn(name = "formatid")
    private Format format;

    @ManyToOne(cascade = {CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.PERSIST,
            CascadeType.REFRESH})
    @JoinColumn(name = "instrumentid")
    private MusicInstrument instrument;

    @ManyToOne(cascade = {CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.PERSIST,
            CascadeType.REFRESH})
    @JoinColumn(name = "publisherid")
    private Publisher publisher;


    @Column(name = "difficulty")
    private String difficulty;

    @Column(name = "editor")
    private String editor;

    public MusicDetail (Music music, MusicInstrument instrument, String difficulty, String editor, Publisher publisher){
        this.music = music;
        this.instrument = instrument;
        this.difficulty = difficulty;
        this.editor = editor;
        this.publisher = publisher;
    }
    public MusicDetail(){}
}
