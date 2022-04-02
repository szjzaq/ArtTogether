package com.example.backend.main.dao;

import com.example.backend.main.domain.entity.Artwork;

import java.util.List;

public interface ArtworkDao {

    List<Artwork> selectAllArtwork();

    int addArtwork(Artwork artwork);

    int deleteArtworkByName(String name);

    int deleteArtWorkById(int id);
}
