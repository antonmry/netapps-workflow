/**
 *
 * Created by antonmry on 11/11/15.
 */
import org.gradle.sample.Greeter;

//This is not a real integration test but a simulation

class TestingIntegrationSpec extends spock.lang.Specification {
    def "testingInt-greeter"() {
        given: "a new TestingInt class is created"
        def greeter = new Greeter();

        expect: "Adding two numbers to return the sum"
        greeter.getGreeting().equals("hello Gradle 2")
    }
}
