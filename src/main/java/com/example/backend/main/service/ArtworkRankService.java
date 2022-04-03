package com.example.backend.main.service;

import com.example.backend.main.domain.dto.ArtworkRankQuery;
import com.example.backend.main.domain.entity.ArtworkRank;

import java.util.List;
import java.util.Map;

public interface ArtworkRankService {

    List<ArtworkRankQuery> getRanks();

    int addArtPointById(int artworkId);

}
