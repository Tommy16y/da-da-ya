package kg.examtommy.exammm.service;

import kg.examtommy.exammm.entity.EndPoint;
import kg.examtommy.exammm.repository.EndPointRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EndPointServiceImpl implements EndPointService {
    @Autowired
    private EndPointRepository endPointRepository;
    @Override
    public EndPoint create(EndPoint endPoint) {
        return endPointRepository.save(endPoint);
    }
}
