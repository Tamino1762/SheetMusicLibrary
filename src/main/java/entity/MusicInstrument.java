package entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "instrument")
public class MusicInstrument {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "instrumentid")
    private int instrumentId;

    @Column(name = "type")
    private String type;

    public int getInstrumentId() {
        return instrumentId;
    }

    public void setInstrumentId(int instrumentId) {
        this.instrumentId = instrumentId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public MusicInstrument() {
    }
}
