package marketing.company.translator.impl;

import marketing.company.domain.dto.PhotosDto;
import marketing.company.domain.persistence.Photos;
import marketing.company.repo.persistence.PhotosRepository;
import marketing.company.translator.PhotosTranslator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PhotosTranslatorImpl implements PhotosTranslator
{
    private final PhotosRepository photosRepository;
    @Autowired
    public PhotosTranslatorImpl(PhotosRepository photosRepository)
    {
        this.photosRepository = photosRepository;
    }


    public List<PhotosDto> getAllPhotos()
    {

        List<PhotosDto> photosDto =new ArrayList<>();
        try
        {
            for (Photos photos :photosRepository.findAll())
            {
             //  photosDto.;
            }
        }
        catch (Exception e)
        {
            throw new RuntimeException("Unable to read from DB",e);
        }

        return photosDto;

    }
}
