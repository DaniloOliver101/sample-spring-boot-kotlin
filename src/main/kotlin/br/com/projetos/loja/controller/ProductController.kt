package br.com.projetos.loja.controller


import br.com.projetos.loja.model.ProductData
import br.com.projetos.loja.service.ProductService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController


@RestController
class ProductController (
    val productService: ProductService
){

@PostMapping("/product")
    fun createProduct(@RequestBody dataJson:ProductData,){
productService.create(dataJson)


    }

    @GetMapping("/product")
    fun list(): ResponseEntity<List<ProductData>> {
return ResponseEntity.status(HttpStatus.OK).body(productService.list())
    }

}