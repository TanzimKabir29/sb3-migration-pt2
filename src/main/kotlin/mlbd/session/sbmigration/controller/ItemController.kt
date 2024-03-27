package mlbd.session.sbmigration.controller;

import io.micrometer.observation.annotation.Observed
import io.micrometer.tracing.Tracer
import mlbd.session.sbmigration.entity.Item
import mlbd.session.sbmigration.model.AddDataRequestBody
import mlbd.session.sbmigration.service.ItemService
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

//@Observed
@RestController
class ItemController(
    private val itemService: ItemService,
    private val tracer: Tracer
) {

    private val log = LoggerFactory.getLogger(javaClass)

    @PostMapping("/item")
    fun addData(@RequestBody requestBody: AddDataRequestBody): ResponseEntity<Item> {
        return ResponseEntity
            .ok()
            .body(itemService.addData(requestBody))
    }

    @GetMapping("mappedData")
    fun getMappedData():ResponseEntity<String> {
        return ResponseEntity
            .ok()
            .body(itemService.getData())
    }

    @GetMapping("tracing")
    fun checkTracing():ResponseEntity<String> {
        val traceId = tracer.currentSpan()?.context()?.traceId()
        val spanId = tracer.currentSpan()?.context()?.spanId()
        log.warn("TraceId: $traceId")
        log.error("SpanId: $spanId")

        return ResponseEntity
            .ok()
            .body("TraceId: $traceId, SpanId: $spanId")
    }
}
