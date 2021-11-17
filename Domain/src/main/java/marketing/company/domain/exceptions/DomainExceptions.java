package marketing.company.domain.exceptions;

import java.io.Serializable;

public class DomainExceptions implements Serializable
{


    private static final long serialVersionUID = -2494460057568018935L;

    public DomainExceptions()
    {

    }
    public void ExceptionsDomainChecker()
    {
        try {

            PhotosExceptions photosExceptions = new PhotosExceptions();

            photosExceptions.PhotosExceptionsErrorCheck();
            AlbumsExceptions albumsExceptions = new AlbumsExceptions();
            albumsExceptions.AlbumsExceptionsErrorCheck();
        }
        catch (Exception error)
        {
            System.out.println("Domain Error");
           System.out.println(error.getMessage());
        }
    }



}
