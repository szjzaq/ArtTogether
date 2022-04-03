package com.example.backend.main.service.impl;

import com.example.backend.main.dao.ArtworkRankDao;
import com.example.backend.main.domain.dto.ArtworkRankQuery;
import com.example.backend.main.domain.entity.ArtworkRank;
import com.example.backend.main.service.ArtworkRankService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

@Service
public class ArtworkRankServiceImpl implements ArtworkRankService {

    @Resource
    private ArtworkRankDao artworkRankDao;

    @Override
    public List<ArtworkRankQuery> getRanks() {
        List<ArtworkRank> artworkRanks = artworkRankDao.getRanks();
        Map<String, Integer> map = new HashMap<>();
        List<ArtworkRankQuery> artworkRankQueries = new ArrayList<>();
        for (ArtworkRank artworkRank :
                artworkRanks) {
            map.merge(artworkRank.getArtworkId().toString(), 1, Integer::sum);

        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            ArtworkRankQuery artworkRankQuery = new ArtworkRankQuery();
            artworkRankQuery.setArtworkId(entry.getKey());
            artworkRankQuery.setPoint(entry.getValue());
            artworkRankQueries.add(artworkRankQuery);
        }
        return artworkRankQueries;
    }

    @Override
    public int addArtPointById(int artworkId) {
        return artworkRankDao.addArtPointById(artworkId);
    }
}
