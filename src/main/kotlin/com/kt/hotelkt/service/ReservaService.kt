package com.kt.hotelkt.service

import com.kt.hotelkt.model.Quarto
import com.kt.hotelkt.model.Reserva
import com.kt.hotelkt.model.ReservaDto
import com.kt.hotelkt.repository.HospedeRepository
import com.kt.hotelkt.repository.QuartoRepository
import com.kt.hotelkt.repository.ReservaRepository
import org.springframework.stereotype.Service

@Service
class ReservaService (private val repository: ReservaRepository, private val hospedeRepository: HospedeRepository, private val quartoRepository: QuartoRepository) {
    fun buscarTodos(): List<Reserva> {
        return  repository.findAll()
    }

    fun buscarPorId(id: Long): Reserva {
        return  repository.getReferenceById(id)
    }

    fun cadastrar(reservaDto: ReservaDto): Reserva {
        print("Service")
        val hospede = hospedeRepository.getReferenceById(reservaDto.hospede)
        val quarto = quartoRepository.getReferenceById(reservaDto.quarto)
        var reserva = Reserva()
        reserva.quarto = quarto
        reserva.hospede = hospede
        reserva.dataInicio = reservaDto.dataInicio
        reserva.dataFim = reservaDto.dataFim
        reserva.quantidadeDias = reservaDto.quantidadeDias
        reserva.cancelada = reservaDto.cancelada
        val newReserva = repository.save(reserva)
        return newReserva
    }
}