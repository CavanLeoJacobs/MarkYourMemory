package marketing.company.translator.Exceptions;


import marketing.company.translator.config.TranslatorConfig;

public class TranslatorExceptions
{
    public TranslatorExceptions()
    {
        ExceptionsTranslator();
    }

    public void ExceptionsTranslator()
    {
        try
        {
            TranslatorConfig translatorConfig =new TranslatorConfig();
            translatorConfig.getClass();
        }
        catch (Exception error) {
            System.out.println("Translator Error");
            System.out.println(error.getMessage());
        }
    }

}
