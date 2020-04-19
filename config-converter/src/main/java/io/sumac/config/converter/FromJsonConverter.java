package io.sumac.config.converter;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FromJsonConverter implements ToJsonNodeConverter<String> {
    public JsonNode convert(String obj) {
        var mapper = new ObjectMapper();
        try {
            return mapper.readTree(obj);
        } catch (Exception e) {
            throw ConversionException.errorConvertingObjectToJsonNode(e);
        }
    }
}
