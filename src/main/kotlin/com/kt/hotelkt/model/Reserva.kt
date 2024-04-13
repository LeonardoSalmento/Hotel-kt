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
    val id: Long = 0;
    @ManyToOne
    var quarto: Quarto? = null;
    @ManyToOne
    var hospede: Hospede? = null;
    var dataInicio: Date? = null;
    var dataFim: Date? = null;
    var quantidadeDias: Int = 0;
    var cancelada: Boolean? = null;
}