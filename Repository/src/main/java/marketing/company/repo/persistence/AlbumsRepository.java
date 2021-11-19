package marketing.company.repo.persistence;

import marketing.company.domain.persistence.Albums;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface AlbumsRepository extends JpaRepository<Albums,Long>
{
    @Query("select a from Albums a where a.albumsID = ?1 and a.fileFormat = ?2 and a.geolocation = ?3 and a.tags = ?4 and a.capturedDate = ?5 and a.capturedBy = ?6")
    Albums findByAlbumsIDAndFileFormatAndGeolocationAndTagsAndCapturedDateAndCapturedBy(Long AlbumsID, String FileFormat, String Geolocation, String Tags, LocalDate CapturedDate, LocalDate CapturedBy);

}
