package marketing.company.domain.exceptions;

import java.io.Serial;
import java.io.Serializable;

public class AlbumsExceptions implements Serializable
{
    @Serial
    private static final long serialVersionUID = 8534509611258995893L;

    public AlbumsExceptions() {
    }
    public void AlbumsExceptionsErrorCheck()
    {
        try
        {
            System.out.println("Photos Error");
        }
        catch (Exception error) {
            System.out.println("Albums Error");
            System.out.println(error.getMessage());
        }
    }

}
