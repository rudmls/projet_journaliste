package fr.ut1.miage.service.impl;

import fr.ut1.miage.model.TypeJour;
import fr.ut1.miage.repository.TypeJourRepository;
import fr.ut1.miage.service.TypeJourService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TypeJourServiceImpl implements TypeJourService {

    private final TypeJourRepository typeJourRepository;

    @Override
    public void create(TypeJour typeJour) {
        try {
            typeJourRepository.save(typeJour);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<TypeJour> getAll() {
        try {
            return typeJourRepository.findAll();
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

}
