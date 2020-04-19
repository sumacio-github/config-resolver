package io.sumac.config.reader;

import org.junit.jupiter.api.Test;

import java.io.IOException;

public class FileReaderTest {

    @Test
    public void testReadFromRemoteFile() throws IOException {
        var output = FileReader.readFromRemoteFile("https://raw.githubusercontent.com/sumacio-github/config-resolver/master/config-reader/src/test/resources/sample.properties");
        System.out.println(output);
    }
}
