package kg.examtommy.exammm.service;

import kg.examtommy.exammm.entity.TicketT;
import kg.examtommy.exammm.model.Ticketon;
import kg.examtommy.exammm.repository.TicketonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketonServiceImpl implements TicketonService {
    @Autowired
    private TicketonRepository ticketonRepository;
    @Override
    public TicketT create(TicketT ticketT) {
        return ticketonRepository.save(ticketT);
    }
}
