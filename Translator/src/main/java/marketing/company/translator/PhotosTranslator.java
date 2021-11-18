package marketing.company.translator;

import marketing.company.domain.persistence.Photos;

public interface PhotosTranslator
{

    void Read(Photos info);
    void Create(Photos info);
    void Update(Photos info);
    void Delete(Photos info);
}
