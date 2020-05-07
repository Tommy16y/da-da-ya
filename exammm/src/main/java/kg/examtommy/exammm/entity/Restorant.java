package kg.examtommy.exammm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Table(name = "restorant")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Restorant {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
    @Column(name ="date_session",nullable = false)
    private Date date;

}
