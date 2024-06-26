package com.kt.hotelkt.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
public class Quarto {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null;
        val numero: Int? = null;
}