package org.b1naryf0x

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * Created by sergiopenavades on 5/26/20.
 */

@SpringBootApplication(proxyBeanMethods = false)
open class PetClinicApplication

fun main(args: Array<String>) {
    runApplication<PetClinicApplication>(*args)
}
