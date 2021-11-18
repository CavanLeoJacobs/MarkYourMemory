package marketing.company.logic.flow.impl;

import marketing.company.domain.dto.AlbumsDto;
import marketing.company.logic.flow.CreateAlbumsFlow;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Component
public class CreateAlbumsFlowImpl implements CreateAlbumsFlow {




 @Override
 public List<AlbumsDto> getAllAlbums() {
  return null;
 }

 @Override
 public AlbumsDto Create(AlbumsDto albumsDto) {
  AlbumsDto results = new AlbumsDto(new AlbumsDto());
  return results;
 }
}


