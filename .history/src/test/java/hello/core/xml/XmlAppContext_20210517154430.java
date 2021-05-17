package hello.core.xml;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

public class XmlAppContext {

    @Test
    void xmlAppContext() {
        XmlApplicationContext genericXmlApplicationContext = new GenericXmlApplicationContext("appConfig.xml");
    }
    
}
