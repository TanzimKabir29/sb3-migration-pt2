package mlbd.session.sbmigration.model

data class AddDataRequestBody(
    val id: Long,
    val name: String,
    val type: String
)
