package com.kt.hotelkt.repository

class QuartoQueries {
    companion object {
        const val BuscarQuartosDisponiveis: String =
                "select * " +
                        "from (" +
                        "select id, numero " +
                        "from quarto) q " +
                        "where q.id not in (" +
                        "select quarto_id " +
                        "from reserva " +
                        "where (:dataInicio < data_inicio or :dataFim > data_inicio) " +
                        "and (:dataInicio < data_fim or :dataFim > data_fim ))"
    }
}