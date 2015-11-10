/**
 *
 * Created by antonmry on 27/10/15.
 */
import org.gradle.sample.Greeter;

//Testing Jenkins

class TestingUnitSpec extends spock.lang.Specification {
    def "testingUnit-greeter"() {
        given: "a new TestingUnit class is created"
        def greeter = new Greeter();

        expect: "Adding two numbers to return the sum"
        greeter.getGreeting().equals("hello Gradle2")
    }
}
