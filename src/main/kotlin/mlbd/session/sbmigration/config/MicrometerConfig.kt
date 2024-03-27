package mlbd.session.sbmigration.config

import io.micrometer.observation.ObservationRegistry
import io.micrometer.observation.aop.ObservedAspect
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class MicrometerConfig {

    // Monitoring beans
    @Bean
    fun observationRegistry(): ObservationRegistry {
//        return ObservationRegistry.create().apply {
//            observationConfig().observationHandler(CustomObservationHandler())
//        }
        return ObservationRegistry.create()
    }

    // To have the @Observed support we need to register this aspect
//    @Bean
//    fun observedAspect(observationRegistry: ObservationRegistry): ObservedAspect {
//        return ObservedAspect(observationRegistry)
//    }
}
