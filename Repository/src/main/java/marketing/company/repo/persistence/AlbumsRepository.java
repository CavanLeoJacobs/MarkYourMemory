package marketing.company.repo.persistence;

import marketing.company.domain.persistence.Albums;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AlbumsRepository extends JpaRepository<Albums,Long>
{


}
