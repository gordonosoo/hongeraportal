package ke.co.safaricom.hongeraportal.repository;

import ke.co.safaricom.hongeraportal.entity.Points;
import org.antlr.v4.runtime.misc.MultiMap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PointsRepository extends JpaRepository<Points, Long> {

    }

