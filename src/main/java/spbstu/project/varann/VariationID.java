package spbstu.project.varann;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
public class VariationID implements Serializable {
    @Getter
    private String chrom;

    @Getter
    private int pos;

    @Getter
    private String ref;

    @Getter
    private String alt;
}
