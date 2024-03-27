package mlbd.session.sbmigration

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import java.util.TimeZone

@SpringBootTest(useMainMethod = SpringBootTest.UseMainMethod.ALWAYS)
class NewTest {

    @Test
    fun sampleTest() {
        println("The default timezone is: ${TimeZone.getDefault().displayName}")
    }
}
