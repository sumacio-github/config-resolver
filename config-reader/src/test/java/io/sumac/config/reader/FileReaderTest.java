package io.sumac.config.reader;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FileReaderTest {

    @Test
    public void testReadFromRemoteFile() throws IOException {
        var output = FileReader.readFromRemoteFile("https://raw.githubusercontent.com/sumacio-github/config-resolver/master/config-reader/src/test/resources/sample.txt");
        assertThat(output, is("foobar"));
    }

    @Test
    public void testReadFromClasspath() throws IOException {
        var output = FileReader.readFromClasspath("sample.txt");
        assertThat(output, is("foobar"));
    }

    @Test
    public void testReadFromFile() throws IOException, URISyntaxException {
        URL url = Thread.currentThread().getContextClassLoader().getResource("sample.txt");
        File file = Paths.get(url.toURI()).toFile();
        String absolutePath = file.getAbsolutePath();
        var output = FileReader.readFromFile(absolutePath);
        assertThat(output, is("foobar"));
    }
}
