package com.careydevelopment.mongodbdemo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.careydevelopment.mongodbdemo.entity.ChiveImage;

public interface ImageRepository extends MongoRepository<ChiveImage, String> {

    List<ChiveImage> findTop10ByOrderByDateDesc();
    
}