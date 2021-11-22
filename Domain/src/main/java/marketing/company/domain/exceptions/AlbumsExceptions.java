package marketing.company.domain.exceptions;

import marketing.company.domain.dto.AlbumsDto;
import marketing.company.domain.persistence.Albums;

import java.io.Serializable;
import java.util.Objects;

public class AlbumsExceptions implements Serializable
{

    private static final long serialVersionUID = 8534509611258995893L;

    public AlbumsExceptions() {
    }

    public void AlbumsExceptionsErrorCheck()
    {


        Albums albums=new Albums();
        AlbumsDto albumsDto=new AlbumsDto();

        try
        {
            albums.getFileFormat();
            albumsDto.getFileFormat();

            Long thisID = albums.getAlbumsID();
            albums.getCapturedDate();

            albums.getCapturedBy();
            albums.getCapturedDate();
            Long thisIDDto = albumsDto.getAlbumsID();
            albumsDto.getCapturedDate();

            albumsDto.getCapturedBy();
            albumsDto.getCapturedDate();

            if (!Objects.equals(albums.getFileFormat(), "bmp" )&& (!Objects.equals(albums.getFileFormat(), "jpeg")&& (!Objects.equals(albums.getFileFormat(), "jpg")&& (!Objects.equals(albums.getFileFormat(), "gif")&& (!Objects.equals(albums.getFileFormat(), "tiff")&&(!Objects.equals(albums.getFileFormat(), "pgn")))))))
            {
                System.out.println("Unsupported format, please upload the content in a different format.");


            }
            if (!Objects.equals(albumsDto.getFileFormat(), "bmp" )&& (!Objects.equals(albumsDto.getFileFormat(), "jpeg")&& (!Objects.equals(albumsDto.getFileFormat(), "jpg")&& (!Objects.equals(albumsDto.getFileFormat(), "gif")&& (!Objects.equals(albumsDto.getFileFormat(), "tiff")&&(!Objects.equals(albumsDto.getFileFormat(), "pgn")))))))
            {
                System.out.println("Unsupported format, please upload the content in a different format.");
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
        catch (Exception error)
        {

            System.out.println(error.getMessage());
            System.out.println("Albums Error");
        }

    }

}
