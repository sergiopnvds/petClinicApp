package org.b1naryf0x.services

import org.b1naryf0x.domain.model.Owner

/**
 * Created by sergiopenavades on 11/15/20.
 */
interface OwnerService {
    fun findByLastName(lastName: String)
    fun findById(id: Long)
    fun save(owner: Owner)
    fun findAll(owners: Set<Owner>)
}