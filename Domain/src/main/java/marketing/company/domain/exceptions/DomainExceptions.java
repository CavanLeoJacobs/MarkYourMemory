package marketing.company.domain.exceptions;

import java.io.Serial;
import java.io.Serializable;

public class DomainExceptions implements Serializable
{

    @Serial
    private static final long serialVersionUID = -2494460057568018935L;

    public DomainExceptions()
    {

    }
    public void ExceptionsDomainChecker()
    {
        try {
            AlbumsExceptions albumsExceptions = new AlbumsExceptions();
            PhotosExceptions photosExceptions = new PhotosExceptions();

            albumsExceptions.AlbumsExceptionsErrorCheck();

            photosExceptions.PhotosExceptionsErrorCheck();
        }
        catch (Exception error)
        {
            System.out.println("Domain Error");
           System.out.println(error.getMessage());
        }
        }



}
