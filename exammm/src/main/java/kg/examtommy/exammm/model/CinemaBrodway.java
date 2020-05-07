package kg.examtommy.exammm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CinemaBrodway {
    private String name;
    private String Vmestimost;
    private String address;
    private String site;

    public CinemaBrodway(String toString) {
    }

    @Override
    public String toString() {
        return "CinemaBrodway{" +
                "name='" + name + '\'' +
                ", address = '" + address + '\'' +
                ", Vmestimost='" + Vmestimost + '\'' +
                ",site='"+site+'\''+"}";
    }
}
