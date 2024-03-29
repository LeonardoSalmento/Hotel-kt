package com.kt.hotelkt.service

import com.kt.hotelkt.model.Quarto
import com.kt.hotelkt.repository.QuartoRepository
import org.springframework.stereotype.Service

@Service
class QuartoService (private val repository: QuartoRepository){

    fun buscarTodos(): List<Quarto> {
        return  repository.findAll()
    }
    fun buscarPorId(id: Long): Quarto {
        return  repository.getReferenceById(id)
    }

    fun Cadastrar(quarto: Quarto): Quarto{
        val newQuarto = repository.save(quarto)
        return newQuarto
    }
}