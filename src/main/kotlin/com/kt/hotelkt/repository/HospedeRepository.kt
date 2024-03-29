package com.kt.hotelkt.repository

import com.kt.hotelkt.model.Hospede
import org.springframework.data.jpa.repository.JpaRepository

interface HospedeRepository: JpaRepository<Hospede, Long> {
}