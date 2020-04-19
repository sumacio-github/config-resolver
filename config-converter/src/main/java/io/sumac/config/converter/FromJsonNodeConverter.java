package io.sumac.config.converter;

import com.fasterxml.jackson.databind.JsonNode;

public interface FromJsonNodeConverter<K> extends Converter<JsonNode, K> {
    K convert(JsonNode jsonNode);
}
