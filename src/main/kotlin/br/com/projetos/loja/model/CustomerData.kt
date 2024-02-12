package br.com.projetos.loja.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.DBRef
import org.springframework.data.mongodb.core.mapping.Document


@Document("customers")
data class CustomerData(
    @Id
    var id: String ?,
    var name: String,
    var documentNumber: String,
    @DBRef

    var purchases: List<PurchaseData> ?


)