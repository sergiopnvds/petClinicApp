package org.b1naryf0x.controllers

import org.b1naryf0x.services.PetService
import org.springframework.stereotype.Controller

/**
 * Created by sergiopenavades on 7/19/20.
 */
@Controller
class PetController(private val petService: PetService) {
    fun whichPetIsBest() {
        return petService.getPetType()
    }
}
