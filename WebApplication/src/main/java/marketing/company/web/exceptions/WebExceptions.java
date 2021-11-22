package marketing.company.web.exceptions;

import marketing.company.web.config.WebConfig;

public class WebExceptions
{

    public WebExceptions()
    {

        WebExceptionsCheck();
    }

    public void WebExceptionsCheck()
    {
        try
        {
            WebConfig WEB= new WebConfig();
            WEB.getClass();

        }
        catch (Exception error)
        {
            System.out.println("Web Error");
            System.out.println(error.getMessage());
        }
    }


}
