package com.kt.hotelkt.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne
import java.util.Date

@Entity
public class Reserva {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long = 0;
    @ManyToOne
    val quarto: Quarto? = null;
    @ManyToOne
    val hospede: Hospede? = null;
    val dataInicio: Date? = null;
    val dataFim: Date? = null;
    val quantidadeDias: Int = 0;
    val cancelada: Boolean? = null;
}