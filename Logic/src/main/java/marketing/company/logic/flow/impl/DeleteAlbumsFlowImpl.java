package marketing.company.logic.flow.impl;

import marketing.company.domain.dto.AlbumsDto;
import marketing.company.domain.persistence.Albums;
import marketing.company.logic.flow.DeleteAlbumsFlow;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Transactional
@Component
public class DeleteAlbumsFlowImpl implements DeleteAlbumsFlow
{
    @Override
    public List<AlbumsDto> DeleteAllAlbumsDto() {
        return null;
    }
    @Override
    public List<Albums> DeleteAllAlbums() {
        return null;
    }

    @Override
    public Albums Delete(Albums albums)
    {
        System.out.println("Deleting the AlbumsDto");
        Long A=null;
        String fileformat=null;
        String tages=null;
        String geolocation=null;
        LocalDate CapturedDate =null;
        LocalDate CapturedBy =null;
        albums.setAlbumsID(A);
        albums.setFileFormat(fileformat);
        albums.setTags(tages);
        albums.setCapturedBy(CapturedBy);
        albums.setGeolocation(geolocation);
        albums.setCapturedDate(CapturedDate);
        System.out.println("Deleting the AlbumsDto" +  albums.getClass());
        System.out.println(("ID : " + A));
        System.out.println(("fileformat : "+ fileformat));
        System.out.println(("geolocation : " +geolocation ));
        System.out.println(("tages : "+tages));
        System.out.println(("CapturedDate : " + CapturedDate));
        System.out.println(("CapturedBy : " + CapturedBy));
        return null;
    }
    @Override
    public  AlbumsDto Delete(AlbumsDto albumsDto)
    {
        System.out.println("Deleting the AlbumsDto");
        Long A=null;
        String fileformat=null;
        String tages=null;
        String geolocation=null;
        LocalDate CapturedDate =null;
        LocalDate CapturedBy =null;
        albumsDto.setAlbumsID(A);
        albumsDto.setFileFormat(fileformat);
        albumsDto.setTags(tages);
        albumsDto.setCapturedBy(CapturedBy);
        albumsDto.setGeolocation(geolocation);
        albumsDto.setCapturedDate(CapturedDate);
        System.out.println("Deleting the AlbumsDto" +  albumsDto.getClass());
        System.out.println(("ID : " + A));
        System.out.println(("fileformat : "+ fileformat));
        System.out.println(("geolocation : " +geolocation ));
        System.out.println(("tages : "+tages));
        System.out.println(("CapturedDate : " + CapturedDate));
        System.out.println(("CapturedBy : " + CapturedBy));
        return null;
    }

}
