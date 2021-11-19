package marketing.company.repo.persistence;

import marketing.company.domain.persistence.Photos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface PhotosRepository extends JpaRepository <Photos,Long>
{
    @Query("select p from Photos p where p.photoID = ?1 and p.fileFormat = ?2 and p.geolocation = ?3 and p.tags = ?4 and p.capturedDate = ?5 and p.capturedBy = ?6")
    Photos findByPhotoIDAndFileFormatAndGeolocationAndTagsAndCapturedDateAndCapturedBy(Long PhotoID, String FileFormat, String Geolocation, String Tags, LocalDate CapturedDate, LocalDate CapturedBy);

}
