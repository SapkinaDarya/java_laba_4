import junit.framework.TestCase;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.List;

public class CsvToBeanReaderTest extends TestCase {
    @Test
    public void testCsvToClass () throws FileNotFoundException {
        List<Person> person = new CsvToBeanReader().CsvToClass();
        person.forEach(person1 -> System.out.println(person1));

    }
}