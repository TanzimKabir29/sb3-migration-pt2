package mlbd.session.sbmigration

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "custom-property")
data class MappedProperty(
    val name: String,
    val type: String
)
