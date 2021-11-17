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
                if (!Objects.equals(albums.getFileFormat(), "pgn"))
                {
                    System.out.println("must be in pgn format (Albums)");
                }
                if (!Objects.equals(albumsDto.getFileFormat(), "pgn"))
                {
                    System.out.println("must be in pgn format (AlbumsDto)");
                }





        }
        catch (Exception error) {
            System.out.println("Albums Error");
            System.out.println(error.getMessage());
        }
    }

}
