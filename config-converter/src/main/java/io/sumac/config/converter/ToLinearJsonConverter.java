package io.sumac.config.converter;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ToLinearJsonConverter implements FromJsonNodeConverter<String> {
    public String convert(JsonNode jsonNode) {
        var mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(jsonNode);
        } catch (Exception e) {
           throw ConversionException.errorConvertingJsonNodeToObject(e);
        }
    }
}
