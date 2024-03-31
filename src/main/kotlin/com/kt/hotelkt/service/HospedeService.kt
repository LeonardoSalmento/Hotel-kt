package com.kt.hotelkt.service

import com.kt.hotelkt.model.Hospede
import com.kt.hotelkt.model.Quarto
import com.kt.hotelkt.repository.HospedeRepository
import org.springframework.stereotype.Service

@Service
class HospedeService (private val repository: HospedeRepository){
    fun buscarTodos(): List<Hospede> {
        return  repository.findAll()
    }

    fun buscarPorId(id: Long): Hospede {
        return  repository.getReferenceById(id)
    }

    fun cadastrar(hospede: Hospede): Hospede {
        val newHospede = repository.save(hospede)
        return newHospede
    }
}