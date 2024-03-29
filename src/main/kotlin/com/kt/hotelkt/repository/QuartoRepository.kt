package com.kt.hotelkt.repository

import com.kt.hotelkt.model.Quarto
import org.springframework.data.jpa.repository.JpaRepository

interface QuartoRepository: JpaRepository<Quarto, Long> {
}