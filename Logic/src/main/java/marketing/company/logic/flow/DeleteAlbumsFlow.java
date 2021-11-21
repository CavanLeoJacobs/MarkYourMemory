package marketing.company.logic.flow;

import marketing.company.domain.dto.AlbumsDto;
import marketing.company.domain.persistence.Albums;

import java.util.List;

public interface DeleteAlbumsFlow
{
    List<AlbumsDto> DeleteAllAlbumsDto();
    List<Albums> DeleteAllAlbums();
    AlbumsDto Delete(AlbumsDto albumsDto);
    Albums Delete(Albums albums);

}
