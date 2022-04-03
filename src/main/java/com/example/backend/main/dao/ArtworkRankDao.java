package com.example.backend.main.dao;

import com.example.backend.main.domain.entity.ArtworkRank;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArtworkRankDao {

    List<ArtworkRank> getRanks();

    int addArtPointById(int artworkId);

}
