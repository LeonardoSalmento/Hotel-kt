package com.kt.hotelkt.repository

import com.kt.hotelkt.model.Reserva
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import java.util.*

interface ReservaRepository: JpaRepository<Reserva, Long> {
    fun findByHospedeNome(nome: String){}
}