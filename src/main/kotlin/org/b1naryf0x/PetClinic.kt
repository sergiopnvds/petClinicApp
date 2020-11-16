package org.b1naryf0x

import org.b1naryf0x.controllers.PetController
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.ApplicationContext

/**
 * Created by sergiopenavades on 5/26/20.
 */

@SpringBootApplication
class PetClinic

fun main(args: Array<String>) {
    @Suppress("SpreadOperator")
    val context = runApplication<PetClinic> (*args)

    val petController = context.getBean("petController", PetController::class.java)
    println(petController.whichPetIsBest())
}
