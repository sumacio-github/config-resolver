package io.sumac.config.converter;

import com.fasterxml.jackson.databind.JsonNode;

public interface ToJsonNodeConverter<T> extends Converter<T, JsonNode> {
    JsonNode convert(T obj);
}
