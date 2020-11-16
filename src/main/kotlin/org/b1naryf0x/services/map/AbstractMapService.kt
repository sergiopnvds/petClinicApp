package org.b1naryf0x.services.map

/**
 * Created by sergiopenavades on 11/15/20.
 */
abstract class AbstractMapService<T, ID> {
    private var map: HashMap<ID, T> = HashMap()

    open fun findAll(): HashSet<T> {
        return HashSet(map.values)
    }

    open fun findById(id: ID): T? {
        return map[id]
    }

    open fun save(id: ID, obj: T): T {
        map[id] = obj
        return obj
    }

    open fun deleteById(id: ID) {
        map.remove(id)
    }

    open fun delete(obj: T) {
        map.entries.removeIf { entry-> entry.value == obj }
    }
}