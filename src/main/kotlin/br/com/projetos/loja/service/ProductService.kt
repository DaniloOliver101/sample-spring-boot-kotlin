package br.com.projetos.loja.service

import br.com.projetos.loja.model.ProductData
import br.com.projetos.loja.repository.ProductRepository
import org.springframework.stereotype.Service

@Service
class ProductService (
    val productRepository: ProductRepository
){

    fun create(productData: ProductData){
productRepository.save(productData)



    }

    fun list() : List<ProductData> {
        return productRepository.findAll()
    }
}