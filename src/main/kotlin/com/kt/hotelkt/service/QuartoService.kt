package com.kt.hotelkt.service

import com.kt.hotelkt.model.PesquisarDataDto
import com.kt.hotelkt.model.Quarto
import com.kt.hotelkt.repository.QuartoRepository
import org.springframework.stereotype.Service
import java.time.LocalDate

@Service
class QuartoService (private val repository: QuartoRepository){

    fun buscarTodos(): List<Quarto> {
        return  repository.findAll()
    }

    fun quartosDisponiveisPorData(datas: PesquisarDataDto): List<Quarto> {
        print(datas.dataInicio.toString())
        print(datas.dataFim.toString())
        val dataFim = datas.dataInicio.plusDays(datas.QuantidadeDias)

        return repository.QuartosDiponiveisPorData(datas.dataInicio, dataFim)
    }

    fun buscarPorId(id: Long): Quarto {
        return  repository.getReferenceById(id)
    }

    fun cadastrar(quarto: Quarto): Quarto{
        val newQuarto = repository.save(quarto)
        return newQuarto
    }
}