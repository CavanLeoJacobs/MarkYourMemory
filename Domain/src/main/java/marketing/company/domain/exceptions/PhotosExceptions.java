package marketing.company.domain.exceptions;

import java.io.Serial;
import java.io.Serializable;

public class PhotosExceptions implements Serializable
{
    @Serial
    private static final long serialVersionUID = -4734025335945959621L;

    public PhotosExceptions()
    {

    }

    public void PhotosExceptionsErrorCheck()
    {
        try
        {
            System.out.println("Photos Check");

        }
        catch (Exception error)
        {
            System.out.println("Photos Error");
            System.out.println(error.getMessage());
        }

    }
}
