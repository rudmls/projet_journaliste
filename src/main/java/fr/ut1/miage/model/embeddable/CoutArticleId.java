package fr.ut1.miage.model.embeddable;

import fr.ut1.miage.model.Journaliste;
import fr.ut1.miage.model.Rubrique;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class CoutArticleId implements Serializable {

    @ManyToOne
    @JoinColumn(name = "CodeRU")
    private Rubrique rubrique;

    @ManyToOne
    @JoinColumn(name = "CodeJ")
    private Journaliste journaliste;

}
