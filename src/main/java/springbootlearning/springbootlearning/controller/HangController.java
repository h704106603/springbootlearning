package springbootlearning.springbootlearning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springbootlearning.springbootlearning.model.Hang;


@RestController
@EnableConfigurationProperties({Hang.class})
public class HangController {

    @Autowired
    Hang hang;

    @RequestMapping(value = "/hang")
    public String printHang() {
        System.out.println("进入了hang");
        return hang.toString();
    }

}
