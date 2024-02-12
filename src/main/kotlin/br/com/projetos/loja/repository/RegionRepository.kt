package br.com.projetos.loja.repository

import br.com.projetos.loja.model.RegionsData
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface RegionRepository :MongoRepository<RegionsData,String>{
}