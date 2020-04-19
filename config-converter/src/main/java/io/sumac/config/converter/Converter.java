package io.sumac.config.converter;

/**
 * Convert one object to another object
 * @param <T> type to convert
 * @param <K> type converted to
 */
public interface Converter<T,K> {
    K convert(T obj);
}
