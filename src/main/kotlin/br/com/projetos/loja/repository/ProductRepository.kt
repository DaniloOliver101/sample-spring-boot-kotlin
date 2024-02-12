package br.com.projetos.loja.repository

import br.com.projetos.loja.model.ProductData
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository: MongoRepository<ProductData,String>