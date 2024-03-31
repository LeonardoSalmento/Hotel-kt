package com.kt.hotelkt.controller

import com.kt.hotelkt.model.Quarto
import com.kt.hotelkt.model.Reserva
import com.kt.hotelkt.model.ReservaDto
import com.kt.hotelkt.service.ReservaService
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/Reserva")
class ReservaController (private val reservaService: ReservaService) {

    @GetMapping
    fun listarQuartos(): List<Reserva>{
        val reservas = reservaService.buscarTodos()
        return reservas
    }

    @PostMapping
    fun CadastrarReserva(@RequestBody reserva: ReservaDto): Reserva{
        print("Controller")
        val newReserva = reservaService.cadastrar(reserva)
        return newReserva
    }
}