package mlbd.session.sbmigration

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import java.time.ZoneId
import java.util.TimeZone

@ConfigurationPropertiesScan
@EnableJpaRepositories
@SpringBootApplication
class SbmigrationApplication

fun main(args: Array<String>) {
	runApplication<SbmigrationApplication>(*args) {
		TimeZone.setDefault(TimeZone.getTimeZone(ZoneId.of("Asia/Tokyo")))
	}
}
