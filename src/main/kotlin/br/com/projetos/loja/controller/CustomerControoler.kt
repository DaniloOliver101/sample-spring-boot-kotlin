package br.com.projetos.loja.controller

import br.com.projetos.loja.model.CustomerData
import br.com.projetos.loja.service.CustomerService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
class CustomerControoler (
    val customerService: CustomerService
){

@PostMapping("/customer")
    fun createCustomer(@RequestBody dataJson: CustomerData,){
        customerService.create(dataJson)


    }


    @GetMapping("/customer")
    fun listCustomers(): ResponseEntity<List<CustomerData>>{
return ResponseEntity.status(HttpStatus.OK).body(customerService.listCustomers())
    }
    @GetMapping("/customer/{documentNumber}")
    fun getCustomerByDocumentNumber(@PathVariable documentNumber: String): ResponseEntity<CustomerData> {
        return ResponseEntity.status(HttpStatus.OK).body(  customerService.getCustomerByDocumentNumber(documentNumber))

    }

}