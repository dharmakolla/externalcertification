package externalcertification;

import com.sun.nio.sctp.MessageInfo;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})

@RestController
@RequestMapping
public class ExternalCertificationController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    @GetMapping("/index")
    public String indexPage(){
        return "Web service deployment successful";
    }

}
