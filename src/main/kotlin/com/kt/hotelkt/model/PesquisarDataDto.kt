package com.kt.hotelkt.model

import java.time.LocalDate

class PesquisarDataDto {
    val dataInicio: LocalDate = LocalDate.now();
    val dataFim: LocalDate = LocalDate.now();
    val QuantidadeDias: Long = 0;
}