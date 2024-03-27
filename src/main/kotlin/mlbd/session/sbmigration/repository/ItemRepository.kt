package mlbd.session.sbmigration.repository

import mlbd.session.sbmigration.entity.Item
import org.springframework.data.jpa.repository.JpaRepository

interface ItemRepository : JpaRepository<Item, Long>
