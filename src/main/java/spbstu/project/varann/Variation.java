package spbstu.project.varann;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(VariationID.class)
public class Variation {

    @Id private String chrom;
    @Id private int pos;
    @Id private String ref;
    @Id private String alt;
    private String info;

    protected Variation() {}

    public Variation(String chrom, int pos, String ref, String alt, String info) {
        this.chrom = chrom;
        this.pos = pos;
        this.ref = ref;
        this.alt = alt;
        this.info = info;
    }

    public String getChrom() {
        return chrom;
    }

    public void setChrom(String chrom) {
        this.chrom = chrom;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
