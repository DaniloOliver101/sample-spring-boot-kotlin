package br.com.projetos.loja.repository

import br.com.projetos.loja.model.PurchaseData
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface PurchaseRepository: MongoRepository<PurchaseData,String> {
}