package br.com.projetos.loja.service

import br.com.projetos.loja.model.CustomerData
import br.com.projetos.loja.model.ProductData
import br.com.projetos.loja.model.PurchaseData
import br.com.projetos.loja.repository.CustomerRepository
import br.com.projetos.loja.repository.PurchaseRepository
import org.springframework.stereotype.Service

@Service
class PurchaseService(

    val purchaseRepository: PurchaseRepository,
    val customerRepository: CustomerRepository
) {
    fun createPurchase(documentNumber: String, products: List<ProductData>): PurchaseData {
        val customer: CustomerData = customerRepository.findByDocumentNumber(documentNumber)!!
        val purchase = PurchaseData(customer =customer , productList = products, totalValue = products.sumOf { products.sumOf { it.price } })

     purchaseRepository.save(purchase)
        return purchase
    }
    fun getPurchases(): MutableList<PurchaseData> {
        return purchaseRepository.findAll()
    }



}