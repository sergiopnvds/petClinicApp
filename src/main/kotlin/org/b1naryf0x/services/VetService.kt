package org.b1naryf0x.services

import org.b1naryf0x.model.Vet

/**
 * Created by sergiopenavades on 11/15/20.
 */
interface VetService {
    fun findByLastName(lastName: String)
    fun findById(id: Long)
    fun save(vet: Vet)
    fun findAll(vets: Set<Vet>)
}