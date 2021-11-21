package marketing.company.repo.persistence;

import marketing.company.domain.persistence.Photos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PhotosRepository extends JpaRepository <Photos,Long>
{
 @Query (value = "SELECT"
           +"*"
           +"FROM"
           +"Photos"
           +"WHERE Photos.photoID = :photoID")

 Photos getPhotosByPhotoID(String photoID);

}
