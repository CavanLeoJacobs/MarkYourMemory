package marketing.company.domain.services;

import java.io.Serializable;
import java.util.Objects;

public class AlbumsGeneralResponse<T> implements Serializable
{

    private static final long serialVersionUID = 1314535159669886339L;
    private final boolean successful;
    private final T added;
    public AlbumsGeneralResponse()
    {

    }


    public AlbumsGeneralResponse(boolean successful,T added)
    {
        this.successful = successful;
        this.added= added;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlbumsGeneralResponse<?> that = (AlbumsGeneralResponse<?>) o;
        return successful == that.successful && Objects.equals(added, that.added);
    }

    @Override
    public int hashCode() {
        return Objects.hash(successful, added);
    }
}

/* boolean AddBool=false;
    Boolean AddButtonClick=false;

   public String AddedTrue()
   {

       return "Albums sucsessfully added";
   }

    public String DeletedTrue(String delete)
    {
        return "Albums sucsessfully delete";
    }
    public String SharedTrue(String shared)
    {
        return "Albums sucsessfully shared";
    }

    public boolean AddBool(Boolean AddButtonClick)
    {
        if (AddButtonClick==true)
        {

            AddBool=true;
        }
        else
        {
            AddBool=false;
        }

            return AddBool;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlbumsGeneralResponse that = (AlbumsGeneralResponse) o;
        return AddBool == that.AddBool && Objects.equals(AddButtonClick, that.AddButtonClick);
    }

    @Override
    public int hashCode() {
        return Objects.hash(AddBool, AddButtonClick);
    }

 */
