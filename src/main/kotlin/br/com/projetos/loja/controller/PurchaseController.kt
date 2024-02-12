package br.com.projetos.loja.controller


import br.com.projetos.loja.model.ProductData
import br.com.projetos.loja.model.PurchaseData
import br.com.projetos.loja.service.PurchaseService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
class PurchaseController(
    val purchaseService: PurchaseService
) {


    @PostMapping("/purchase")
    fun createPurchase(
        @RequestParam token: String,
        @RequestParam documentNumber: String,

        @RequestBody data: List<ProductData>
    ): ResponseEntity<PurchaseData> {
        return ResponseEntity.status(HttpStatus.OK).body(purchaseService.createPurchase(documentNumber,data)
        )
    }
    @GetMapping("/purchase")
    fun getPurchases(): ResponseEntity<MutableList<PurchaseData>> {
        return ResponseEntity.status(HttpStatus.OK).body(purchaseService.getPurchases())
    }


}