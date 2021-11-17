package marketing.company.domain.exceptions;

import marketing.company.domain.dto.AlbumsDto;
import marketing.company.domain.dto.PhotosDto;
import marketing.company.domain.persistence.Albums;
import marketing.company.domain.persistence.Photos;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Objects;

class DomainExceptionsTest {

    DomainExceptions domainExceptions=new DomainExceptions();
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
   public void TestDomain() {

        AlbumsDto albumsDto = new AlbumsDto();
        Albums albums = new Albums();
        PhotosDto photosDto = new PhotosDto();
        Photos photos = new Photos();

            if (albums.getFileFormat()!= "pgn")
            {
                System.out.println("must be in pgn format (Albums)");
            }
            if (!Objects.equals(albumsDto.getFileFormat(), "pgn")) {
                System.out.println("must be in pgn format (AlbumsDto)");
            }
        if (photos.getFileFormat()!= "pgn")
        {
            System.out.println("must be in pgn format (photos)");
        }
        if (!Objects.equals(photosDto.getFileFormat(), "pgn")) {
            System.out.println("must be in pgn format (photosDto)");
        }



    }


}