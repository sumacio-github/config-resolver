package io.sumac.config.converter;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ToFormattedJsonConverter implements FromJsonNodeConverter<String> {
    public String convert(JsonNode jsonNode) {
        var mapper = new ObjectMapper();
        try {
            return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonNode);
        } catch (Exception e) {
            throw ConversionException.errorConvertingJsonNodeToObject(e);
        }
    }
}