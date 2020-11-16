package org.b1naryf0x.services.map

import org.b1naryf0x.domain.model.Pet
import org.b1naryf0x.services.CrudService

/**
 * Created by sergiopenavades on 11/15/20.
 */
class PetMapService : CrudService<Pet, Long>, AbstractMapService<Pet, Long>() {
    override fun findAll(objs: Set<Pet>): Set<Pet> {
        return super.findAll()
    }

    override fun findById(id: Long): Pet? {
        return super.findById(id)
    }

    override fun save(obj: Pet): Pet {
        return super.save(obj.id, obj)
    }

    override fun delete(obj: Pet) {
        super.delete(obj)
    }

    override fun deleteById(id: Long) {
        super.deleteById(id)
    }
}