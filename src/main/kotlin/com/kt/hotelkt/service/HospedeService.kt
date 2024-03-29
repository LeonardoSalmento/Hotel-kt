package com.kt.hotelkt.service

import com.kt.hotelkt.model.Hospede
import com.kt.hotelkt.repository.HospedeRepository
import org.springframework.stereotype.Service

@Service
class HospedeService (private val repository: HospedeRepository){
    fun buscarPorId(id: Long): Hospede{
        return repository.getReferenceById(id)
    }
}