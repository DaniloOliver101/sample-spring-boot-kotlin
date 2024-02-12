package br.com.projetos.loja.repository

import br.com.projetos.loja.model.CustomerData
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository : MongoRepository<CustomerData,String>{
    fun findByDocumentNumber(documentNumber: String): CustomerData?
}