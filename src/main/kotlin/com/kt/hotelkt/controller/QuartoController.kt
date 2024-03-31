package com.kt.hotelkt.controller

import com.kt.hotelkt.model.PesquisarDataDto
import com.kt.hotelkt.model.Quarto
import com.kt.hotelkt.service.QuartoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/Quarto")
class QuartoController (private val quartoService: QuartoService){

    @GetMapping()
    fun BuscarQuartos(): List<Quarto>{
        val quartos = quartoService.buscarTodos()
        return quartos
    }

    @PostMapping("/buscarQuartosDisponiveis")
    fun BuscarQuartosDisponiveis(@RequestBody quarto: PesquisarDataDto): List<Quarto>{
        val quartos = quartoService.quartosDisponiveisPorData(quarto)
        return quartos
    }
    @GetMapping("/{id}")
    fun BuscarQuartoPorId(@PathVariable id: Long): Quarto{
        val quarto = quartoService.buscarPorId(id)
        return quarto
    }
    @PostMapping
    fun CadastrarQuarto(@RequestBody quarto: Quarto): Quarto{
        val newQuarto = quartoService.cadastrar(quarto)
        return newQuarto
    }
}