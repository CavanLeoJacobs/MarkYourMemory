package marketing.company.domain.services;

import java.io.Serializable;
import java.util.Objects;

public class AlbumsGeneralResponse<T> implements Serializable
{

    private static final long serialVersionUID = 1314535159669886339L;
    private final boolean successfully;
    private final transient T service;

    public AlbumsGeneralResponse(boolean successfully,T service)
    {
        this.successfully = successfully;
        this.service= service;
    }
    public boolean isSuccessful()
    {
        return successfully;
    }
    public T getService()
    {
        return service;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AlbumsGeneralResponse)) return false;
        AlbumsGeneralResponse<?> that = (AlbumsGeneralResponse<?>) o;
        return successfully == that.successfully && Objects.equals(getService(), that.getService());
    }

    @Override
    public int hashCode() {
        return Objects.hash(successfully, service);
    }

    @Override
    public String toString() {
        return "AlbumsGeneralResponse{" +
                "successfully=" + successfully +
                ", service=" + service +
                '}';
    }
}
  /*


    @Override
    public boolean equals(Object O) {
        if (this == O) return true;
        if (O==null || getClass() != O.getClass()) return false;
        GeneralResponse<?> that = (GeneralResponse<?>) O;
        return successful == that.successful && Objects.equals(payload,that.payload);
    }

   private final T ;



    public AlbumsGeneralResponse(boolean successful,T )
    {
        this.successful = successful;
        this.= ;
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


     */






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
