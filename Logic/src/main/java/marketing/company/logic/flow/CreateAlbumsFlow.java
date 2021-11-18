package marketing.company.logic.flow;

import marketing.company.domain.dto.AlbumsDto;

import java.util.List;

public interface CreateAlbumsFlow
{

  List<AlbumsDto> getAllAlbums();
    AlbumsDto Create(AlbumsDto albumsDto);


}
