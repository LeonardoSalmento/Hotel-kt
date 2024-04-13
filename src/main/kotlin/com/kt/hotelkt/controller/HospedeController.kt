package com.kt.hotelkt.controller

import com.kt.hotelkt.model.Hospede
import com.kt.hotelkt.model.Quarto
import com.kt.hotelkt.repository.HospedeRepository
import com.kt.hotelkt.service.HospedeService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/Hospede")
class HospedeController (private val hospedeService: HospedeService) {
    @GetMapping()
    fun BuscarQuartos(): List<Hospede>{
        val hospedes = hospedeService.buscarTodos()
        return hospedes
    }
    @GetMapping("/{id}")
    fun BuscarQuartoPorId(@PathVariable id: Long): Hospede {
        val hospede = hospedeService.buscarPorId(id)
        return hospede
    }
    @PostMapping
    fun CadastrarQuarto(@RequestBody hospede: Hospede): Hospede {
        val newHospede = hospedeService.cadastrar(hospede)
        return newHospede
    }
}