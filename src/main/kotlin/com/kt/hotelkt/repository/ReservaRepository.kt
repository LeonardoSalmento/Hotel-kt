package com.kt.hotelkt.repository

import com.kt.hotelkt.model.Reserva
import org.springframework.data.jpa.repository.JpaRepository

interface ReservaRepository: JpaRepository<Reserva, Long> {
}