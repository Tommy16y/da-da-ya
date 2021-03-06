package kg.examtommy.exammm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Table(name = "tickett")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TicketT {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
    @Column(name ="date_session",nullable = false)
    private Date date;
}
