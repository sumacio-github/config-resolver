package io.sumac.config.converter;

public abstract class ConversionException extends RuntimeException {
    protected ConversionException(String msg, Throwable t) {
        super(msg, t);
    }

    public static ConversionException errorConvertingObjectToJsonNode(Throwable t) {
        return new UnreadableObjectException("Unable to parse input object", t);
    }

    public static ConversionException errorConvertingJsonNodeToObject(Throwable t) {
        return new UnreadableObjectException("Unable to parse output object", t);
    }

    static class UnreadableObjectException extends ConversionException {
        protected UnreadableObjectException(String msg, Throwable t) {
            super(msg, t);
        }
    }

    static class NonConvertableObjectException extends ConversionException {
        protected NonConvertableObjectException(String msg, Throwable t) {
            super(msg, t);
        }
    }
}
