package fr.ut1.miage.model.embeddable;

import fr.ut1.miage.model.Client;
import fr.ut1.miage.model.Publication;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Date;

@Embeddable
@Builder
@NoArgsConstructor @AllArgsConstructor
public class AbonnerId implements Serializable {

    @ManyToOne
    @JoinColumn(name = "CodeC")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "CodePU")
    private Publication publication;

    @Column(name = "DateDeb")
    private Date dateDebut;

}
