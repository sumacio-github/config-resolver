package io.sumac.config.converter;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.javaprop.JavaPropsMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator;

public class ToPropertiesConverter implements FromJsonNodeConverter<String> {
    public String convert(JsonNode jsonNode) {
        var mapper = new JavaPropsMapper();
        try {
            return mapper.writeValueAsString(jsonNode);
        } catch (Exception e) {
            throw ConversionException.errorConvertingJsonNodeToObject(e);
        }
    }
}
