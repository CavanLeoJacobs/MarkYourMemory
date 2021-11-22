package marketing.company.logic.exceptions;

import marketing.company.logic.flow.impl.CreateAlbumsFlowImpl;
import marketing.company.logic.flow.impl.ReadPhotosFlowImpl;
import marketing.company.logic.flow.impl.UpdateAlbumsFlowImpl;

public class LogicExceptions
{
    public LogicExceptions()
    {
        LogicException();
    }

    public void LogicException()
    {

        try
        {
            CreateAlbumsFlowImpl createAlbumsFlow=new CreateAlbumsFlowImpl();
            UpdateAlbumsFlowImpl updateAlbumsFlow=new UpdateAlbumsFlowImpl();
            ReadPhotosFlowImpl readPhotosFlow=new ReadPhotosFlowImpl();


            createAlbumsFlow.CreateAllAlbums();
            updateAlbumsFlow.UpdateAllAlbums();
            readPhotosFlow.ReadAllPhotos();
        }
        catch (Exception error)
        {
           System.out.println("Logic Error");
            System.out.println(error.getMessage());

        }
    }
}
