package marketing.company.web.exceptions;

import marketing.company.domain.exceptions.DomainExceptions;
import marketing.company.logic.exceptions.LogicExceptions;
import marketing.company.repo.exceptions.ExceptionsRepository;
import marketing.company.translator.Exceptions.TranslatorExceptions;

public class ApplicationExceptions
{
    DomainExceptions domain =new DomainExceptions();
    LogicExceptions logic =new LogicExceptions();
    TranslatorExceptions translator =new TranslatorExceptions();
    ExceptionsRepository repository =new ExceptionsRepository();
    WebExceptions web= new WebExceptions();

    public ApplicationExceptions()
    {
        ApplicationExceptionsCheck();
    }

    public void ApplicationExceptionsCheck()
    {
        try
        {
            repository.ExceptionsRepositoryChecker();
            domain.ExceptionsDomainChecker();
            logic.LogicException();
            translator.ExceptionsTranslator();
            web.WebExceptionsCheck();
            System.out.println("\n");
        }

        catch (Exception error)
        {

            System.out.println("Application Error");
            System.out.println(error.getMessage());

        }
    }

}
