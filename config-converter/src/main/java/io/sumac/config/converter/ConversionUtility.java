package io.sumac.config.converter;

import io.sumac.config.converter.*;

public final class ConversionUtility {
    public static String jsonToJson(String jsonString) {
        return new ToFormattedJsonConverter().convert(new FromJsonConverter().convert(jsonString));
    }
    public static String jsonToLinearJson(String jsonString) {
        return new ToLinearJsonConverter().convert(new FromJsonConverter().convert(jsonString));
    }
    public static String yamlToJson(String yamlString) {
        return new ToFormattedJsonConverter().convert(new FromYamlConverter().convert(yamlString));
    }
    public static String propertiesToJson(String propertiesString) {
        return new ToFormattedJsonConverter().convert(new FromPropertiesConverter().convert(propertiesString));
    }

    public static String yamlToYaml(String yamlString) {
        return new ToYamlConverter().convert(new FromYamlConverter().convert(yamlString));
    }
    public static String jsonToYaml(String jsonString) {
        return new ToYamlConverter().convert(new FromJsonConverter().convert(jsonString));
    }
    public static String propertiesToYaml(String propertiesString) {
        return new ToYamlConverter().convert(new FromPropertiesConverter().convert(propertiesString));
    }

    public static String propertiesToProperties(String propertiesString) {
        return new ToPropertiesConverter().convert(new FromPropertiesConverter().convert(propertiesString));
    }
    public static String jsonToProperties(String jsonString) {
        return new ToPropertiesConverter().convert(new FromJsonConverter().convert(jsonString));
    }
    public static String yamlToProperties(String yamlString) {
        return new ToPropertiesConverter().convert(new FromYamlConverter().convert(yamlString));
    }

}
