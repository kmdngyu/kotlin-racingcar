package racingcar.ui

import racingcar.Car
import racingcar.Cars

class ResultView {
    fun printCurrent(cars: Cars) {
        cars.cars.map {
            println(it.name + ":  " + createPositionBar(it))
        }
        println()
    }

    private fun createPositionBar(it: Car): String {
        var positionBar = ""
        repeat(it.position) {
            positionBar += POSITION_DISPLAY_BAR
        }
        return positionBar
    }

    companion object {
        const val POSITION_DISPLAY_BAR: String = "-"
    }
}
