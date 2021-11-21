package marketing.company.logic.flow;

import marketing.company.domain.dto.AlbumsDto;
import marketing.company.domain.persistence.Albums;

import java.util.List;

public interface CreateAlbumsFlow
{

  List<AlbumsDto> CreateAllAlbumsDto();
  List<Albums> CreateAllAlbums();
  AlbumsDto Create(AlbumsDto albumsDto);
  Albums Create(Albums albums);


}
