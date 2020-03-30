package spbstu.project.varann;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(VariationID.class)
@NoArgsConstructor
@AllArgsConstructor
public class Variation {
    @Id
    @Getter
    @Setter
    private String chrom;

    @Id
    @Getter
    @Setter
    private int pos;

    @Id
    @Getter
    @Setter
    private String ref;

    @Id
    @Getter
    @Setter
    private String alt;

    @Getter
    @Setter
    private String info;
}
