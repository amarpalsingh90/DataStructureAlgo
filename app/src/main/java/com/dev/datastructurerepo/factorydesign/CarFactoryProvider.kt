package com.dev.datastructurerepo.factorydesign

class CarFactoryProvider {

    fun getCar(carType: String): GetCar {
        return when {
            carType == "Tata" -> {
                return TataCar()
            }

            carType == "Maruti" -> {
                return MarutiCar()
            }

            else -> {
                return KiaCar()
            }
        }

    }
}