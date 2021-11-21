package marketing.company.logic.flow.impl;

import marketing.company.domain.dto.AlbumsDto;
import marketing.company.domain.persistence.Albums;
import marketing.company.logic.flow.ReadAlbumsFlow;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Component
public class ReadAlbumsFlowImpl implements ReadAlbumsFlow
{

   @Override
    public Albums Read(Albums albums)
    {


        albums.getAlbumsID();
        albums.getFileFormat();
        albums.getGeolocation();
        albums.getTags();
        albums.getCapturedDate();
        albums.getCapturedBy();


        return albums;

    }
    @Override
    public AlbumsDto ReadDto(AlbumsDto albumsDto)
    {

        albumsDto.setAlbumsID(albumsDto.getAlbumsID());
        albumsDto.setFileFormat(albumsDto.getFileFormat());
        albumsDto.setGeolocation(albumsDto.getGeolocation());
        albumsDto.setTags(albumsDto.getTags());
        albumsDto.setCapturedDate(albumsDto.getCapturedDate());
        albumsDto.setCapturedBy(albumsDto.getCapturedBy());
        return albumsDto;
    }


    public List<AlbumsDto> ReadAllAlbumsDto()
    {
        AlbumsDto  albumsDto =new AlbumsDto();
        albumsDto.setAlbumsID(albumsDto.getAlbumsID());
        albumsDto.setFileFormat(albumsDto.getFileFormat());
        albumsDto.setGeolocation(albumsDto.getGeolocation());
        albumsDto.setTags(albumsDto.getTags());
        albumsDto.setCapturedDate(albumsDto.getCapturedDate());
        albumsDto.setCapturedBy(albumsDto.getCapturedBy());

        return (List<AlbumsDto>) albumsDto;
    }



    public List<Albums> ReadAllAlbums()
    {
        Albums albums =new Albums();
        albums.setAlbumsID(albums.getAlbumsID());
        albums.setFileFormat(albums.getFileFormat());
        albums.setGeolocation(albums.getGeolocation());
        albums.setTags(albums.getTags());
        albums.setCapturedDate(albums.getCapturedDate());
        albums.setCapturedBy(albums.getCapturedBy());


        return (List<Albums>) albums;
    }




}
