package marketing.company.translator.impl;

import marketing.company.domain.dto.AlbumsDto;
import marketing.company.domain.persistence.Albums;
import marketing.company.repo.persistence.AlbumsRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AlbumsTranslatorImpl
{

    private final AlbumsRepository albumsRepository;
    public AlbumsTranslatorImpl()
    {

    }
    @Autowired
    public AlbumsTranslatorImpl(AlbumsRepository albumsRepository)
    {
        this.albumsRepository=albumsRepository;
    }

    @Override
    public AlbumsDto getFileFormat(String FileFormat)
    {
        return null;
    }
    /*
    @Override
    public AlbumsDto getAdministrator_Surname(String Administrator_Surname)
    {
        return null;
    }

     */
}
