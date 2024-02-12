package br.com.projetos.loja.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document


@Document("products")
data class ProductData (
    @Id
    var id:String?,
    var productName: String,
    var productDescription: String,
    var price: Double,
    var quantity: Long




)

