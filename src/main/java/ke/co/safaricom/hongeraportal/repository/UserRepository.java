package ke.co.safaricom.hongeraportal.repository;

import ke.co.safaricom.hongeraportal.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
