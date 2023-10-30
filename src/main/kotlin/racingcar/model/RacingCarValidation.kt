package racingcar.model

import racingcar.exception.IllegalNameException

class RacingCarValidation {

    fun validation(name: String) {
        if (name.length > MAX_NAME_LEN || name.isEmpty() || name.isBlank()) {
            throw IllegalNameException()
        }
    }

    companion object {
        private const val MAX_NAME_LEN = 5
    }
}