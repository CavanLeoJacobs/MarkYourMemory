package marketing.company.domain.exceptions;

import marketing.company.domain.dto.AlbumsDtoTest;
import marketing.company.domain.dto.PhotosDtoTest;
import marketing.company.domain.persistence.AlbumsTest;
import marketing.company.domain.persistence.PhotosTest;
import org.junit.jupiter.api.Test;

public class DomainExceptionsTest {

    DomainExceptions domainExceptions=new DomainExceptions();




    @Test
   public void TestDomain()
    {
        try {
            AlbumsDtoTest albumsDtoTest = new AlbumsDtoTest();
            AlbumsTest albumsTest = new AlbumsTest();
            PhotosDtoTest photosDtoTest = new PhotosDtoTest();
            PhotosTest photosTest = new PhotosTest();

            String format = albumsTest.getrun("pgn");
            System.out.print("\n");
            System.out.println("the format was  "+format +" for the albums");
            if (format != "pgn" && format != "bmp" && format != "ico" && format != "jpeg" && format != "jpg" && format != "gif" && format != "tiff") {
                System.out.println("For your album");
                System.out.println("must be in one of the follow formats (pgn ||bmp||ico||jpeg||jpg||gif||tiff )"+"\n");

            }
            String formatPhoto = photosTest.getrun("abc");
            System.out.print("\n");
            System.out.println("the format was  "+formatPhoto+" for the photos");
            if (formatPhoto != "pgn" && formatPhoto != "bmp" && formatPhoto != "ico" && formatPhoto != "jpeg" && formatPhoto != "jpg" && formatPhoto != "gif" && formatPhoto != "tiff") {
                System.out.println("For your photo");
                System.out.println("must be in one of the follow formats (pgn ||bmp||ico||jpeg||jpg||gif||tiff )"+"\n");

            }
           String formatAlbumsDto =albumsDtoTest.getrun("jpg");
            System.out.print("\n");
            System.out.println("the format was  "+formatAlbumsDto+ "  for the AlbumsDto");
            if (formatAlbumsDto != "pgn" && formatAlbumsDto != "bmp" && formatAlbumsDto != "ico" && formatAlbumsDto != "jpeg" && formatAlbumsDto != "jpg" && formatAlbumsDto != "gif" && formatAlbumsDto != "tiff") {

                System.out.println("For your albumDto");
                System.out.println("must be in one of the follow formats (pgn ||bmp||ico||jpeg||jpg||gif||tiff )"+"\n");

            }
            String formatPhotoDto = photosDtoTest.getrun("1234");
            System.out.print("\n");
            System.out.println("the format was  "+formatPhotoDto+ "  for the PhotoDto");

            if (formatPhotoDto != "pgn" && formatPhotoDto != "bmp" && formatPhotoDto != "ico" && formatPhotoDto != "jpeg" && formatPhotoDto != "jpg" && formatPhotoDto != "gif" && formatPhotoDto != "tiff") {
                System.out.println("For your photoDto");
                System.out.println("must be in one of the follow formats (pgn ||bmp||ico||jpeg||jpg||gif||tiff )"+"\n");

            }

        }
        catch (Exception errors)
        {
            System.out.println(errors.getMessage());
        }
    }


}