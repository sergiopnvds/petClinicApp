package org.b1naryf0x.services

import org.b1naryf0x.domain.model.Owner

/**
 * Created by sergiopenavades on 11/15/20.
 */
interface CrudService<T, ID> {
    fun findAll(objs: Set<T>): Set<T>
    fun findById(id: ID): T?
    fun save(obj: T): T
    fun delete(obj: T)
    fun deleteById(id: ID)
}