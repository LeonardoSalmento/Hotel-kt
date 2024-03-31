package com.kt.hotelkt.repository

import com.kt.hotelkt.model.Quarto
import com.kt.hotelkt.repository.QuartoQueries.Companion.BuscarQuartosDisponiveis
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import java.time.LocalDate

interface QuartoRepository: JpaRepository<Quarto, Long> {
    //@Query(value = "Select q.id, q.numero from Quarto q left join Reserva r on r.quarto_id = q.id " +
         //"where :dataInicio not between r.data_inicio and data_fim and :dataFim not between r.data_inicio and data_fim " +
            //"" , nativeQuery = true)

    @Query(value = BuscarQuartosDisponiveis , nativeQuery = true)

    fun QuartosDiponiveisPorData(dataInicio: LocalDate, dataFim: LocalDate): List<Quarto>
}