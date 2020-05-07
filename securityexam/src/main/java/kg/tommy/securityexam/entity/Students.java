package kg.tommy.securityexam.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.util.Date;
@Entity
@Table(name = "students")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name =" name",nullable = false)
    private String name;
    @OneToMany
    @Column(name ="course",nullable = false)
    private TableCourse course;
    @Column(name ="time_registration",nullable = false)
    private Date date;
    @Column(name ="summm",nullable = false)
    private Long summm;

}
