package kg.examtommy.exammm.controller;

import kg.examtommy.exammm.entity.Cinema;
import kg.examtommy.exammm.entity.EndPoint;
import kg.examtommy.exammm.entity.Restorant;
import kg.examtommy.exammm.entity.TicketT;
import kg.examtommy.exammm.model.CinemaBrodway;
import kg.examtommy.exammm.model.RestorantNavat;
import kg.examtommy.exammm.model.Ticketon;
import kg.examtommy.exammm.repository.EndPointRepository;
import kg.examtommy.exammm.service.CinemaService;
import kg.examtommy.exammm.service.EndPointService;
import kg.examtommy.exammm.service.ResorantService;
import kg.examtommy.exammm.service.TicketonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {
    @Autowired
    private EndPointService endPointService;


    @GetMapping("/book/{code}")
    public Object getObject(@PathVariable String code)
    {
        Ticketon ticketon = new Ticketon();
        RestorantNavat restorantNavat = new RestorantNavat();
        CinemaBrodway cinemaBrodway = new CinemaBrodway();
        if(code.equals("R")) return  restorantNavat.toString() ;
        else  if(code.equals("C")) return  cinemaBrodway.toString();
        else if(code.equals("T")) return ticketon.toString();

        return null;}

    @PostMapping("/book/{code}")
    public EndPoint create(@PathVariable String code){
        EndPoint endPoint = new EndPoint();
        endPoint.setName(code);
        return endPointService.create(endPoint);
    }
}
