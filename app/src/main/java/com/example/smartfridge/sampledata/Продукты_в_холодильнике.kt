package com.example.smartfridge.sampledata

import java.time.LocalDate

data class Продукты_в_холодильнике(
    var idПродукта:Int,
    var IdХолодильника: Int,
    var Наименование: String,
    var IdЕдиницы: Int?,
    var Остаток: Int?,
    var ДатаДобавления: LocalDate,
    var СрокГодности:Int,
    var Б: Int?,
    var Ж: Int?,
    var У: Int?,
    var Кк: Int?
) : java.io.Serializable