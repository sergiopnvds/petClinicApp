package org.b1naryf0x.services.map

import org.b1naryf0x.domain.model.Owner
import org.b1naryf0x.services.CrudService

/**
 * Created by sergiopenavades on 11/15/20.
 */
class OwnerMapService : CrudService<Owner, Long>, AbstractMapService<Owner, Long>() {
    override fun findAll(objs: Set<Owner>): Set<Owner> {
        return super.findAll()
    }

    override fun findById(id: Long): Owner? {
        return super.findById(id)
    }

    override fun save(obj: Owner): Owner {
        return super.save(obj.id, obj)
    }

    override fun delete(obj: Owner) {
        super.delete(obj)
    }

    override fun deleteById(id: Long) {
        super.deleteById(id)
    }
}