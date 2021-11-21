package marketing.company.domain.persistence;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name= "Albums",schema = "Mark_your_Memories")
@ApiModel(value="Albums",description="A DTO that represents the Albums")
public class Albums implements Serializable
{

    private static final long serialVersionUID = -4984226601624324688L;
    private Long AlbumsID;
    private String FileFormat;
    private String Geolocation;
    private String Tags;
    private LocalDate CapturedDate;
    private LocalDate CapturedBy;

    public Albums()
    {
    }

    public Albums(Long albumsID, String fileFormat, String geolocation, String tags, LocalDate capturedDate, LocalDate capturedBy) {
        AlbumsID = albumsID;
        FileFormat = fileFormat;
        Geolocation = geolocation;
        Tags = tags;
        CapturedDate = capturedDate;
        CapturedBy = capturedBy;
    }

    @Id
    @ApiModelProperty(position=1 ,value = "Albums.AlbumsID")
    @Column(name = "AlbumsID")
    public Long getAlbumsID() {
        return AlbumsID;
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

    public void setAlbumsID(Long albumsID) {
        AlbumsID = albumsID;
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
        Albums albums = (Albums) o;
        return Objects.equals(AlbumsID, albums.AlbumsID) && Objects.equals(FileFormat, albums.FileFormat) && Objects.equals(Geolocation, albums.Geolocation) && Objects.equals(Tags, albums.Tags) && Objects.equals(CapturedDate, albums.CapturedDate) && Objects.equals(CapturedBy, albums.CapturedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(AlbumsID, FileFormat, Geolocation, Tags, CapturedDate, CapturedBy);
    }
}

