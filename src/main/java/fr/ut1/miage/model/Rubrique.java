package fr.ut1.miage.model;

import javax.persistence.*;

@Entity
public class Rubrique {

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
