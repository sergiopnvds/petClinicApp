package org.b1naryf0x.services

import org.b1naryf0x.domain.model.Owner

/**
 * Created by sergiopenavades on 11/15/20.
 */
interface OwnerService: CrudService<Owner, Long> {
    fun findByLastName(lastName: String)
}