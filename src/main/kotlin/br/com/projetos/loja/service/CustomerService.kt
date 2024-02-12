package br.com.projetos.loja.service

import br.com.projetos.loja.model.CustomerData
import br.com.projetos.loja.repository.CustomerRepository
import org.springframework.stereotype.Service

@Service
class CustomerService (
    val customerRepository: CustomerRepository
){

    fun create(customerData : CustomerData){
        customerRepository.save(customerData)



    }

    fun listCustomers() : List<CustomerData>{
        return customerRepository.findAll()
    }
    fun getCustomerByDocumentNumber(docuemtnNumber: String): CustomerData? {
        return customerRepository.findByDocumentNumber(docuemtnNumber)




    }

}