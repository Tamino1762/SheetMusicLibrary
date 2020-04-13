package entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "format")
public class Format {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "formatid")
    private int formatId;

    @Column(name = "type")
    private String type;

    public int getFormatId() {
        return formatId;
    }

    public void setFormatId(int formatId) {
        this.formatId = formatId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Format() {
    }
}
