package mlbd.session.sbmigration.config

import io.micrometer.observation.Observation
import io.micrometer.observation.ObservationHandler
import org.slf4j.LoggerFactory


class CustomObservationHandler : ObservationHandler<Observation.Context> {
    private val log = LoggerFactory.getLogger(javaClass)

    override fun supportsContext(context: Observation.Context): Boolean {
        log.info("Context: $context")
        return true
    }

    override fun onStart(context: Observation.Context) {
        super.onStart(context)
        log.info("Logged onStart")
    }

    override fun onScopeOpened(context: Observation.Context) {
        super.onScopeOpened(context)
        log.info("Logged onScopeOpened")
    }

    override fun onScopeClosed(context: Observation.Context) {
        super.onScopeClosed(context)
        log.info("Logged onScopeClosed")
    }

    override fun onStop(context: Observation.Context) {
        super.onStop(context)
        log.info("Logged onStop")
    }
}
