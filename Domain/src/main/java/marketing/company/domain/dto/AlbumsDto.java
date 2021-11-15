package marketing.company.domain.dto;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class AlbumsDto implements Serializable
{
    @Serial
    private static final long serialVersionUID = -5520752670541908581L;
    private Long AlbumsID;
    private String FileFormat;
    private String Geolocation;
    private String Tags;
    private LocalDate CapturedDate;
    private LocalDate CapturedBy;

    public AlbumsDto()
    {

    }

    public AlbumsDto(Long albumsID, String fileFormat, String geolocation, String tags, LocalDate capturedDate, LocalDate capturedBy) {

        AlbumsID = albumsID;
        FileFormat = fileFormat;
        Geolocation = geolocation;
        Tags = tags;
        CapturedDate = capturedDate;
        CapturedBy = capturedBy;
    }


    public AlbumsDto(AlbumsDto albums)
    {

        this.setAlbumsID(albums.getAlbumsID());
        this.setFileFormat(albums.getFileFormat());
        this.setGeolocation(albums.getGeolocation());
        this.setTags(albums.getTags());
        this.setCapturedDate(albums.getCapturedDate());
        this.setCapturedBy(albums.getCapturedBy());

    }

    public Long getAlbumsID() {
        return AlbumsID;
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
        AlbumsDto albumsDto = (AlbumsDto) o;
        return Objects.equals(AlbumsID, albumsDto.AlbumsID) && Objects.equals(FileFormat, albumsDto.FileFormat) && Objects.equals(Geolocation, albumsDto.Geolocation) && Objects.equals(Tags, albumsDto.Tags) && Objects.equals(CapturedDate, albumsDto.CapturedDate) && Objects.equals(CapturedBy, albumsDto.CapturedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(AlbumsID, FileFormat, Geolocation, Tags, CapturedDate, CapturedBy);
    }
}
