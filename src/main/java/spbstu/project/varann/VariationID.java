package spbstu.project.varann;

public class VariationID {

    private String chrom;
    private int pos;
    private String ref;
    private String alt;

    private VariationID() {}

    public VariationID(String chrom, int pos, String ref, String alt) {
        this.chrom = chrom;
        this.pos = pos;
        this.ref = ref;
        this.alt = alt;
    }

    public String getChrom() {
        return chrom;
    }

    public int getPos() {
        return pos;
    }

    public String getRef() {
        return ref;
    }

    public String getAlt() {
        return alt;
    }
}
