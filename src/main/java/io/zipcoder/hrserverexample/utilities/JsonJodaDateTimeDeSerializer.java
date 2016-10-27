package io.zipcoder.hrserverexample.utilities;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.expression.ParseException;

import java.io.IOException;

public class JsonJodaDateTimeDeSerializer extends JsonDeserializer<DateTime> {

    private static DateTimeFormatter formatter = DateTimeFormat.forPattern("MM/dd/yyyy HH:mm:ss");

    @Override
    public DateTime deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
        String date = jp.getText();
        try{
            return formatter.parseDateTime(date);
        } catch (ParseException e){
            throw new RuntimeException(e);
        }
    }
}
