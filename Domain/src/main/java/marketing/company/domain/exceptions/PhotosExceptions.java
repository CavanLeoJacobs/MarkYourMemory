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
        PhotosDto photosDto=new PhotosDto();
        Photos photos=new Photos();

           if (!Objects.equals(photos.getFileFormat(), "pgn"))
           {
               System.out.println("must be in pgn format (Photo)");
           }
            if (!Objects.equals(photosDto.getFileFormat(), "pgn"))
            {
                System.out.println("must be in pgn format (PhotoDto)");
            }





    }
}
