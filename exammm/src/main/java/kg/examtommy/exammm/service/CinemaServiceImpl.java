package kg.examtommy.exammm.service;

import kg.examtommy.exammm.entity.Cinema;
import kg.examtommy.exammm.repository.CinemaReposiroty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CinemaServiceImpl implements CinemaService {
    @Autowired
    private CinemaReposiroty cinemaReposiroty;
    @Override
    public Cinema create(Cinema cinema) {
        return cinemaReposiroty.save(cinema);
    }
}
