package org.b1naryf0x.domain.entities

import java.io.Serializable

/**
 * Created by sergiopenavades on 11/15/20.
 */
abstract class BaseEntity : Serializable{
    open var id: Long = 0;
}