package kg.examtommy.exammm.service;

import kg.examtommy.exammm.entity.Restorant;
import kg.examtommy.exammm.model.RestorantNavat;
import kg.examtommy.exammm.repository.ResorantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResorantServiceImpl implements ResorantService {
    @Autowired
    private ResorantRepository resorantRepository;
    @Override
    public Restorant create(Restorant restorant) {
        return resorantRepository.save(restorant);
    }
}
