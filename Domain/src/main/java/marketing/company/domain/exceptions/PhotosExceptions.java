package marketing.company.domain.exceptions;

import marketing.company.domain.dto.PhotosDto;
import marketing.company.domain.persistence.Photos;

import java.io.Serializable;
import java.util.Objects;

public class PhotosExceptions implements Serializable
{

    private static final long serialVersionUID = -4734025335945959621L;

    public PhotosExceptions()
    {

    }
    public void PhotosExceptionsErrorCheck()
    {
        try
        {
            Photos photos = new Photos();
            PhotosDto photosDto=new PhotosDto();
            Long thisID = photos.getPhotoID();
            photos.getCapturedDate();
            photos.getFileFormat();
            photos.getCapturedBy();
            photos.getCapturedDate();
            Long thisIDDto = photosDto.getPhotosID();
            photosDto.getCapturedDate();
            photosDto.getFileFormat();
            photosDto.getCapturedBy();
            photosDto.getCapturedDate();

            if (!Objects.equals(photos.getFileFormat(), "bmp" )&& (!Objects.equals(photos.getFileFormat(), "jpeg")&& (!Objects.equals(photos.getFileFormat(), "jpg")&& (!Objects.equals(photos.getFileFormat(), "gif")&& (!Objects.equals(photos.getFileFormat(), "tiff")&&(!Objects.equals(photos.getFileFormat(), "pgn")))))))
            {
                if (photos.getFileFormat()!=null)
                {
                    System.out.println("Unsupported format, please upload the content in a different format.");
                }
            }
            if (!Objects.equals(photosDto.getFileFormat(), "bmp" )&& (!Objects.equals(photosDto.getFileFormat(), "jpeg")&& (!Objects.equals(photosDto.getFileFormat(), "jpg")&& (!Objects.equals(photosDto.getFileFormat(), "gif")&& (!Objects.equals(photosDto.getFileFormat(), "tiff")&&(!Objects.equals(photosDto.getFileFormat(), "pgn")))))))
            {
                if (photosDto.getFileFormat()!=null)
                {
                    System.out.println("Unsupported format, please upload the content in a different format.");
                }

            }

            if (thisID==thisIDDto)
            {
                System.out.println("User not found, please ensure that user is registered");
            }
            if (thisID==null)
            {
                if (thisIDDto==null)
                {
                    System.out.println("Access Required");
                }
            }
        }
        catch (Exception error) {

            System.out.println("Photos error");
            System.out.println(error.getMessage());
        }




    }
}
