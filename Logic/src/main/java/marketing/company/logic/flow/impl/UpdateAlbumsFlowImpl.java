package marketing.company.logic.flow.impl;

import marketing.company.domain.dto.AlbumsDto;
import marketing.company.domain.persistence.Albums;
import marketing.company.logic.flow.UpdateAlbumsFlow;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Transactional
@Component
public class UpdateAlbumsFlowImpl implements UpdateAlbumsFlow
{
    @Override
    public Albums Update(Albums albums )
    {
        System.out.println("Updating the Albums");
        LocalDate capturedDate =albums.getCapturedDate();
        LocalDate capturedBy = albums.getCapturedBy();
        String fileformat=albums.getFileFormat();
        String tages= albums.getTags();
        String geolocation= albums.getGeolocation();
        albums.setFileFormat(fileformat);
        albums.setTags(tages);
        albums.setGeolocation(geolocation);
        albums.setCapturedBy(capturedBy);
        albums.setCapturedBy(capturedDate);
        return albums;
    }

    @Override
    public List<AlbumsDto> UpdateAllAlbumsDto() {
        return null;
    }

    @Override
    public List<Albums> UpdateAllAlbums() {
        return null;
    }

    @Override
    public AlbumsDto Update(AlbumsDto albumsDto)
    {
        System.out.println("Updating the PhotosDto");
        LocalDate capturedDate = albumsDto.getCapturedDate();
        LocalDate capturedBy = albumsDto.getCapturedBy();
        String fileformat=albumsDto.getFileFormat();
        String tages=albumsDto.getTags();
        String geolocation= albumsDto.getGeolocation();
        albumsDto.setFileFormat(fileformat);
        albumsDto.setTags(tages);
        albumsDto.setGeolocation(geolocation);
        albumsDto.setCapturedBy(capturedBy);
        albumsDto.setCapturedBy(capturedDate);
        return albumsDto;
    }
}
