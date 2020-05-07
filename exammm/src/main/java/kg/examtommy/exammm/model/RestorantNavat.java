package kg.examtommy.exammm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RestorantNavat {
    private String name;
    private String address;
    private String SpecialFood;
    private String site;

    public RestorantNavat(String toString) {
    }


    @Override
    public String toString() {
        return "RestorantNavat{" +
                "name='" + name + '\'' +
                ", address = '" + address + '\'' +
                ", SpecialFood ='" + SpecialFood + '\'' +
                ",site='"+site+'\''+"}";
    }
}
