import org.junit.*;
import java.util.*;
import play.test.*;
import models.*;

public class BasicTest extends UnitTest {
    @Test
    public void createAndRerieveUser() {
    	new User("bob@gmail.com" ,"secret", "Bob").save();

    	User bob = User.find("byEmail", "bob@gmail.com").first();

    	assertNotNull(bob);
    	assertEquals("Bob", bob.fullname);
    }
}
