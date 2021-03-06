package fr.ut1.miage.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Builder
@NoArgsConstructor @AllArgsConstructor
public class Journaliste implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CodeJ")
    private int code;

    @Column(name = "NomJ")
    private String nom;

    @Column(name = "PrenomJ")
    private String prenom;

    @ManyToOne
    @JoinColumn(name = "CodeTYJ", foreignKey = @ForeignKey(name = "Fk_Journaliste_CodeTYJ"))
    private TypeJour typeJour;

    @ManyToOne
    @JoinColumn(name = "CodeD", foreignKey = @ForeignKey(name = "Fk_Journaliste_CodeD"))
    private Diplome diplome;

    @Column(name = "Dateobt")
    private Date dateObtention;

}
