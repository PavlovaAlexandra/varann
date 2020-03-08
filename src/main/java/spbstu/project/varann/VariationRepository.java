package spbstu.project.varann;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VariationRepository extends CrudRepository {
    List<Variation> findByChrom(String chrom);

    List<Variation> findByPos(int pos);

    List<Variation> findByRef(String ref);

    List<Variation> findByAlt(String alt);

    List<Variation> findByInfo(String info);
}
