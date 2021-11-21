package marketing.company.logic.flow;

import marketing.company.domain.dto.AlbumsDto;
import marketing.company.domain.persistence.Albums;

import java.util.List;

public interface UpdateAlbumsFlow
{
   List<AlbumsDto> UpdateAllAlbumsDto();
    List<Albums> UpdateAllAlbums();
    AlbumsDto Update(AlbumsDto albumsDto);
    Albums Update(Albums albums);
}
