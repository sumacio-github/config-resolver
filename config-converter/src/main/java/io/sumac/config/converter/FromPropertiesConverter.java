package io.sumac.config.converter;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.javaprop.JavaPropsMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

public class FromPropertiesConverter implements ToJsonNodeConverter<String> {
    public JsonNode convert(String obj) {
        var mapper = new JavaPropsMapper();
        try {
            return mapper.readTree(obj);
        } catch (Exception e) {
            throw ConversionException.errorConvertingObjectToJsonNode(e);
        }
    }
}
