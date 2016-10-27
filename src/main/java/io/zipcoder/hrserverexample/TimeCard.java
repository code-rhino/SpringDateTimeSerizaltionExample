package io.zipcoder.hrserverexample;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.zipcoder.hrserverexample.utilities.JsonJodaDateTimeDeSerializer;
import io.zipcoder.hrserverexample.utilities.JsonJodaDateTimeSerializer;
import org.joda.time.DateTime;


public class TimeCard {

    private DateTime startTime;


    @JsonSerialize(using = JsonJodaDateTimeSerializer.class)
    public DateTime getStartTime() {
        return startTime;
    }

    @JsonDeserialize(using = JsonJodaDateTimeDeSerializer.class)
    public void setStartTime(DateTime startTime) {
        this.startTime = startTime;
    }
}
