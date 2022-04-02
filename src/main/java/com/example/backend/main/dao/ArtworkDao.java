package com.example.backend.main.dao;

import com.example.backend.main.domain.entity.Artwork;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArtworkDao {

    List<Artwork> selectAllArtwork();

    int addArtwork(Artwork artwork);

    int deleteArtworkByName(String name);

    int deleteArtworkById(int id);

    int updateArtworkByName(Artwork artwork);
}
