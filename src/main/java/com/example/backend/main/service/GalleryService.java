package com.example.backend.main.service;

import com.example.backend.main.domain.entity.Gallery;

import java.util.List;

public interface GalleryService {

    List<Gallery> selectAllGallery();

    int addGallery(Gallery gallery);

    int deleteGalleryById(Integer id);

    int deleteGalleryByName(String name);

}
