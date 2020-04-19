package io.sumac.config.reader;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public final class FileReader {

    public static String readFromRemoteFile(String fileUrl) throws IOException {
        var url = new URL(fileUrl);
        try (var inputStream = url.openStream()) {
            return readFromInputStream(inputStream);
        }
    }

    public static String readFromClasspath(String resourceName) throws IOException {
        var classloader = Thread.currentThread().getContextClassLoader();
        try (var inputStream = classloader.getResourceAsStream(resourceName)) {
            return readFromInputStream(inputStream);
        }
    }

    public static String readFromFile(String filePath) throws IOException {
        var file = new File(filePath);
        try (var inputStream = new FileInputStream(file)) {
            return readFromInputStream(inputStream);
        }
    }

    public static String readFromInputStream(InputStream inputStream) throws IOException {
        var stringBuilder = new StringBuilder();
        try (var bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
        }
        return stringBuilder.toString();
    }
}
