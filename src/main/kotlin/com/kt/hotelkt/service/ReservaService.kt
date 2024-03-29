package com.kt.hotelkt.service

import com.kt.hotelkt.model.Reserva
import com.kt.hotelkt.repository.ReservaRepository
import org.springframework.stereotype.Service

@Service
class ReservaService (private val repository: ReservaRepository) {
    fun buscarPorId(id: Long): Reserva {
        return repository.getReferenceById(id)
    }
}