package marketing.company.logic.flow;

import marketing.company.domain.dto.AlbumsDto;
import marketing.company.domain.persistence.Albums;

import java.util.List;

public interface ReadAlbumsFlow
{
     List<AlbumsDto> ReadAllAlbumsDto();
    List<Albums> ReadAllAlbums();
    AlbumsDto ReadDto(AlbumsDto albumsDto);
    Albums Read(Albums albums);




}
