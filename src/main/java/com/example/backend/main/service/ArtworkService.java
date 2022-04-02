package com.example.backend.main.service;

import com.example.backend.main.domain.entity.Artwork;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArtworkService {
    List<Artwork> getArtworks();

    boolean addArtwork(Artwork artwork);

    int deleteArtworkByName(String name);

    int deleteArtWorkById(int id);

}
