package br.com.projetos.loja.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.DBRef
import org.springframework.data.mongodb.core.mapping.Document
import java.text.SimpleDateFormat
import java.util.*

@Document("purchases")
data class PurchaseData(
    @Id
    var id:String?= null,
    @DBRef
    val customer: CustomerData,
    @DBRef
    var productList: List<ProductData>,
    val date: String = SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(Date()),
    val purchaseId: String = "P-{date}",
    val totalValue: Double = 0.0

)