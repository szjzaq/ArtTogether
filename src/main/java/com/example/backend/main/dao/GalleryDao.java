package com.example.backend.main.dao;

import com.example.backend.main.domain.entity.Gallery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GalleryDao {
    List<Gallery> selectAllGallery();

    int addGallery(Gallery gallery);

    int deleteGalleryById(Integer id);

    int deleteGalleryByName(String name);
}
