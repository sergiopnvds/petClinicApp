package org.b1naryf0x.domain.model

import org.b1naryf0x.domain.entities.BaseEntity
import java.time.LocalDate

/**
 * Created by sergiopenavades on 11/15/20.
 */
class Pet: BaseEntity() {
    var birthDate: LocalDate? = null
    var type: PetType? = null
    var owner: Owner? = null
}