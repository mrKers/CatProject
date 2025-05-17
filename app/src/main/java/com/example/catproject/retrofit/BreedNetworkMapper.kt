package com.example.catproject.retrofit

import com.example.catproject.EntityMapper
import com.example.catproject.model.Breed

import javax.inject.Inject

class BreedNetworkMapper
@Inject
constructor() : EntityMapper<BreedNetworkEntity, Breed> {
    override fun mapFromEntity(entity: BreedNetworkEntity): Breed {
        return Breed(
            id = entity.id,
            name = entity.name,
            origin = entity.origin,
            description = entity.description,
            lifeSpan = entity.life_span,
            wikipediaURL = entity.wikipedia_url,
            image = entity.image,
            weight = entity.weight,
            temperament = entity.temperament
        )
    }

    override fun mapToEntity(domainModel: Breed): BreedNetworkEntity {
        return BreedNetworkEntity(
            id = domainModel.id,
            name = domainModel.name,
            origin = domainModel.origin,
            description = domainModel.description,
            life_span = domainModel.lifeSpan,
            wikipedia_url = domainModel.wikipediaURL,
            image = domainModel.image,
            weight = domainModel.weight,
            temperament = domainModel.temperament
        )
    }

    fun mapfromEntityListBreed(entities: List<BreedNetworkEntity>): List<Breed>{
        return entities.map { mapFromEntity(it) }
    }
}