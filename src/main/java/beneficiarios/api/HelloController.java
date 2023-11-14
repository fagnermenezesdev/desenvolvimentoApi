package beneficiarios.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {

    public String olaMundo(){
        return "Hello World";
    }
}
