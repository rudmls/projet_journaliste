package fr.ut1.miage.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Builder
@NoArgsConstructor @AllArgsConstructor
public class Rubrique implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CodeRU")
    private int code;

    @Column(name = "NomRU")
    private int nom;

    @ManyToOne
    @JoinColumn(name = "CodeJ", nullable = false)
    private Journaliste journaliste;

    @ManyToOne
    @JoinColumn(name = "CodePU", nullable = false)
    private Publication publication;

}
