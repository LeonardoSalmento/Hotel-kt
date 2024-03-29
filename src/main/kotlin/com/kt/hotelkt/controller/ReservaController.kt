package com.kt.hotelkt.controller

import com.kt.hotelkt.model.Quarto
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/Reserva")
class ReservaController {

    @GetMapping
    fun listarQuartos(): List<Quarto>{
        val quarto = Quarto()

        val quartos = Arrays.asList(quarto, quarto)
        return quartos
    }
}