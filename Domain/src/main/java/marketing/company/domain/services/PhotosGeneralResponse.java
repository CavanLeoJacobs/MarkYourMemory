package marketing.company.domain.services;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class PhotosGeneralResponse<A> implements Serializable
{

    @Serial
    private static final long serialVersionUID = -5125154957713696269L;


    private final boolean successful;
    private final transient A payload;
    public PhotosGeneralResponse(boolean successful,A payload)
    {
        this.successful = successful;
        this.payload= payload;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash();
    }
}
