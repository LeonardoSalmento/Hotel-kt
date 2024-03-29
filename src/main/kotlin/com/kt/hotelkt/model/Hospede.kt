package com.kt.hotelkt.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import org.intellij.lang.annotations.Identifier

@Entity
public class Hospede {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null;
        val nome: String = "";
}