package br.com.projetos.loja.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document


@Document("regions")
data class RegionsData (
    @Id
    var id:String,
    var estate: String,
    var region: String




)