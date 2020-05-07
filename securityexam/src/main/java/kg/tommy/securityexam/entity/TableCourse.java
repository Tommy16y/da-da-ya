package kg.tommy.securityexam.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "table_course")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TableCourse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name_course",nullable = false)
    private String nameCourse;
}
