package marketing.company.web.controller;

import marketing.company.domain.dto.PhotosDto;
import marketing.company.domain.services.PhotosGeneralResponse;
import marketing.company.logic.flow.ReadPhotosFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/marketing-photos")
public class PhotosController {

    public ResponseEntity<PhotosGeneralResponse<List<PhotosDto>>> responseResponseEntity() {
        List<PhotosDto> photos;

        PhotosGeneralResponse<List<PhotosDto>> response = new PhotosGeneralResponse<List<PhotosDto>>(true,"successfully");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    public PhotosGeneralResponse<String>ReadPhotos()
    {
        return new PhotosGeneralResponse<String>(true, "No Types Found");
    }
    @Autowired
    public PhotosController(ReadPhotosFlow readPhotosFlow) {
        this.readPhotosFlow = readPhotosFlow;
    }
    private final ReadPhotosFlow readPhotosFlow;

}


/*


        @GetMapping("/all")
        @ApiOperation(value = "Gets all the configured Photos.", notes = "Returns a list of Photos")
        @ApiResponses(value = {
                @ApiResponse(code = 200, message = "Account types returned", response = PhotosGeneralResponse.class),
                @ApiResponse(code = 400, message = "Bad Request", response = PhotosGeneralResponse.class),
                @ApiResponse(code = 404, message = "Not found", response = PhotosGeneralResponse.class),
                @ApiResponse(code = 500, message = "Internal Server Error", response = PhotosGeneralResponse.class),
        })
        public ResponseEntity<PhotosGeneralResponse<List<PhotosDto>>> getAll() {
            List<PhotosDto> photos = AddPhotosFlow.getAllPhotos();
            PhotosGeneralResponse<List<PhotosDto>> response = new PhotosGeneralResponse<List<PhotosDto>>();
            return new ResponseEntity<>(response, HttpStatus.OK);
        }

        public PhotosGeneralResponse<String> GetAll() {
            return new PhotosGeneralResponse<String>();
        }

        @Autowired
        public PhotosController(AddPhotosFlow addPhotosFlow) {
            this.addPhotosFlow = addPhotosFlow;
        }

        private final AddPhotosFlow addPhotosFlow;
    }
    */


