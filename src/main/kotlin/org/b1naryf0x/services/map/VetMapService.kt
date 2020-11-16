package org.b1naryf0x.services.map

import org.b1naryf0x.domain.model.Owner
import org.b1naryf0x.domain.model.Vet
import org.b1naryf0x.services.CrudService

/**
 * Created by sergiopenavades on 11/15/20.
 */
class VetMapService : CrudService<Vet, Long>, AbstractMapService<Vet, Long>() {
    override fun findAll(objs: Set<Vet>): Set<Vet> {
        return super.findAll()
    }

    override fun findById(id: Long): Vet? {
        return super.findById(id)
    }

    override fun save(obj: Vet): Vet {
        return super.save(obj.id, obj)
    }

    override fun delete(obj: Vet) {
        super.delete(obj)
    }

    override fun deleteById(id: Long) {
        super.deleteById(id)
    }
}