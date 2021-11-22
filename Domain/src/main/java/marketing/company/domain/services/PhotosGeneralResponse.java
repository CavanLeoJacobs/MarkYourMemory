package marketing.company.domain.services;

import java.io.Serializable;
import java.util.Objects;

public class PhotosGeneralResponse<A> implements Serializable
{


    private static final long serialVersionUID = -5125154957713696269L;

    public PhotosGeneralResponse(boolean successfully, String service) {
        this.successfully = successfully;
        this.service = service;
    }
    private final boolean successfully;
    private final transient String  service;

    public boolean isSuccessful()
    {
        return successfully;
    }
    public String  getService()
    {
        return service;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PhotosGeneralResponse)) return false;
        PhotosGeneralResponse<?> that = (PhotosGeneralResponse<?>) o;
        return successfully == that.successfully && Objects.equals(getService(), that.getService());
    }

    @Override
    public int hashCode() {
        return Objects.hash(successfully, service);
    }

    @Override
    public String toString() {
        return "PhotosGeneralResponse{" +
                "successfully=" + successfully +
                ", service=" + service +
                '}';
    }
}
