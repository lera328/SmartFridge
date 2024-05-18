package com.example.smartfridge.sampledata

import java.time.LocalDate

data class Употребленные_продукты(
    var id_употребленного_продукта:Int,
    var id_пользователя:Int,
    var id_продукта:Int,
    var Количество:Int,
    var Дата: LocalDate,
    var id_приема_пищи:Int
)
