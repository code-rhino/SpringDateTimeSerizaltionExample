package io.zipcoder.hrserverexample;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeCardController {

    @RequestMapping(value="/")
    public TimeCard index(){
        return new TimeCard();
    }

    @RequestMapping(value="/test" ,method= RequestMethod.POST)
    public TimeCard request(@RequestBody TimeCard timeCard){
        return timeCard;
    }
}
