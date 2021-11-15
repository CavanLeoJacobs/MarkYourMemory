package marketing.company.logic.flow.impl;

import marketing.company.domain.dto.AlbumsDto;
import marketing.company.logic.flow.AddAlbumsFlow;

import java.time.LocalDate;

public class AddAlbumsFlowImpl implements AddAlbumsFlow
{


    AlbumsDto Albums = new  AlbumsDto();
    Long ID = Albums.getAlbumsID();
    String fileFormat = Albums.getFileFormat();
    String geolocation = Albums.getGeolocation();
    String tags = Albums.getTags();
    LocalDate capturedDate = Albums.getCapturedDate();
    LocalDate capturedBy = Albums.getCapturedBy();

    public AddAlbumsFlowImpl()
    {

    }
    public AlbumsDto getAllAlbums()
    {

        AddAlbums(Albums);

        return Albums;
    }



    public AlbumsDto AddAlbums(AlbumsDto Albums)
    {

        Albums.setAlbumsID(Albums.getAlbumsID());

         return Albums;
    }
}
