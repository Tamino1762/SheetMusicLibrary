package entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "publisher")
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "publisherid")
    private int publisherId;

    @Column(name="publisher")
    private String publisher;

    @Column(name = "publisher2")
    private String publisher2;

    @Column(name = "publisher3")
    private String publisher3;

    @Column(name = "publisher4")
    private String publisher4;

    public int getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(int publisherId) {
        this.publisherId = publisherId;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher2() {
        return publisher2;
    }

    public void setPublisher2(String publisher2) {
        this.publisher2 = publisher2;
    }

    public String getPublisher3() {
        return publisher3;
    }

    public void setPublisher3(String publisher3) {
        this.publisher3 = publisher3;
    }

    public String getPublisher4() {
        return publisher4;
    }

    public void setPublisher4(String publisher4) {
        this.publisher4 = publisher4;
    }

    public Publisher() {
    }
}
