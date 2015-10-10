package markedjtest;

import io.github.gitbucket.markedj.Marked;

import java.io.IOException;
import java.util.stream.Collectors;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

public class StackOverflowTest {
  @Test
	public void fail() throws IOException {
	  String text = IOUtils.readLines(StackOverflowTest.class.getResourceAsStream("fail.txt"))
      .stream()
      .collect(Collectors.joining(System.lineSeparator()));
	  Marked.marked(text + text + text); // sometimes success...
	}
}
