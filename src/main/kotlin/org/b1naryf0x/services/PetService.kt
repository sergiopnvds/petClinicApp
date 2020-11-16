package org.b1naryf0x.services

import org.b1naryf0x.model.Pet

/**
 * Created by sergiopenavades on 7/19/20.
 */
interface PetService {
    fun findByLastName(lastName: String)
    fun findById(id: Long)
    fun save(pet: Pet)
    fun findAll(pets: Set<Pet>)
}
