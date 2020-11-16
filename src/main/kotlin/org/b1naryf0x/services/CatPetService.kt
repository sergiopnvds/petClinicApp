package org.b1naryf0x.services

import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

/**
 * Created by sergiopenavades on 7/19/20.
 */
@Profile("cat")
@Service
class CatPetService: PetService {
    override fun getPetType() {
        println("Cats are the best")
    }
}
