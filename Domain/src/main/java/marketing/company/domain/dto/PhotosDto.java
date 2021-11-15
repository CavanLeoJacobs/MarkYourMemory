package marketing.company.domain.dto;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class PhotosDto implements Serializable
{

    @Serial
    private static final long serialVersionUID = 1599332068037562367L;
    private Long PhotoID;
    private String FileFormat;
    private String Geolocation;
    private String Tags;
    private LocalDate CapturedDate;
    private LocalDate CapturedBy;

    public PhotosDto() {
    }

    public PhotosDto(Long photoID, String fileFormat, String geolocation, String tags, LocalDate capturedDate, LocalDate capturedBy) {
        PhotoID = photoID;
        FileFormat = fileFormat;
        Geolocation = geolocation;
        Tags = tags;
        CapturedDate = capturedDate;
        CapturedBy = capturedBy;
    }

    public PhotosDto(PhotosDto photos)
    {
        this.setPhotoID(photos.getPhotoID());
        this.setFileFormat(photos.getFileFormat());
        this.setGeolocation(photos.getGeolocation());
        this.setTags(photos.getTags());
        this.setCapturedDate(photos.getCapturedDate());
        this.setCapturedBy(photos.getCapturedBy());

    }
    public Long getPhotoID() {
        return PhotoID;
    }

    public String getFileFormat() {
        return FileFormat;
    }

    public String getGeolocation() {
        return Geolocation;
    }

    public String getTags() {
        return Tags;
    }

    public LocalDate getCapturedDate() {
        return CapturedDate;
    }

    public LocalDate getCapturedBy() {
        return CapturedBy;
    }

    public void setPhotoID(Long photoID) {
        PhotoID = photoID;
    }

    public void setFileFormat(String fileFormat) {
        FileFormat = fileFormat;
    }

    public void setGeolocation(String geolocation) {
        Geolocation = geolocation;
    }

    public void setTags(String tags) {
        Tags = tags;
    }

    public void setCapturedDate(LocalDate capturedDate) {
        CapturedDate = capturedDate;
    }

    public void setCapturedBy(LocalDate capturedBy) {
        CapturedBy = capturedBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhotosDto photosDto = (PhotosDto) o;
        return Objects.equals(PhotoID, photosDto.PhotoID) && Objects.equals(FileFormat, photosDto.FileFormat) && Objects.equals(Geolocation, photosDto.Geolocation) && Objects.equals(Tags, photosDto.Tags) && Objects.equals(CapturedDate, photosDto.CapturedDate) && Objects.equals(CapturedBy, photosDto.CapturedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(PhotoID, FileFormat, Geolocation, Tags, CapturedDate, CapturedBy);
    }
}
