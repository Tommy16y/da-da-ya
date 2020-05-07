package kg.examtommy.exammm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ticketon {
    private String name;
    private String site;
    private String pay;



    @Override
    public String toString() {
        return "Ticketon{" +
                "name='" + name + '\'' +
                ",site='"+site+'\''+
                ",pay='"+pay+'\''+"}";
    }
}
