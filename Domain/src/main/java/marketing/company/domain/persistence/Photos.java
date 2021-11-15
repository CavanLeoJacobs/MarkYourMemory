package marketing.company.domain.persistence;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table
@ApiModel(value="Photos",description="A DTO that represents the Photos")
public class Photos implements Serializable
{
    @Serial
    private static final long serialVersionUID = -3993677784488723183L;
    private Long PhotoID;
    private String FileFormat;
    private String Geolocation;
    private String Tags;
    private LocalDate CapturedDate;
    private LocalDate CapturedBy;

    public Photos()
    {

    }

    @ApiModelProperty(position=1 ,value = "Photos.photoID")
    @Column(name = "PhotoID")
    public Long getPhotoID() {
        return PhotoID;
    }

    @Column(name = "FileFormat")
    public String getFileFormat() {
        return FileFormat;
    }
    @Column(name = "Geolocation")
    public String getGeolocation() {
        return Geolocation;
    }
    @Column(name = "Tags")
    public String getTags() {
        return Tags;
    }
    @Column(name = "CapturedDate")
    public LocalDate getCapturedDate() {
        return CapturedDate;
    }
    @Column(name = "CapturedBy")
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
        Photos photos = (Photos) o;
        return Objects.equals(PhotoID, photos.PhotoID) && Objects.equals(FileFormat, photos.FileFormat) && Objects.equals(Geolocation, photos.Geolocation) && Objects.equals(Tags, photos.Tags) && Objects.equals(CapturedDate, photos.CapturedDate) && Objects.equals(CapturedBy, photos.CapturedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(PhotoID, FileFormat, Geolocation, Tags, CapturedDate, CapturedBy);
    }
}
