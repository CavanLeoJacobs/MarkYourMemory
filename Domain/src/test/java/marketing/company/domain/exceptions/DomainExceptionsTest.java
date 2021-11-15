package marketing.company.domain.exceptions;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DomainExceptionsTest {

    DomainExceptions domainExceptions=new DomainExceptions();
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
   public void TestDomain()
    {

        domainExceptions.ExceptionsDomainChecker();

    }




}