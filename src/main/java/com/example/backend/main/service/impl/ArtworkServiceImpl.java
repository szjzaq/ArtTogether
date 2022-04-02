package com.example.backend.main.service.impl;

import com.example.backend.main.dao.ArtworkDao;
import com.example.backend.main.domain.entity.Artwork;
import com.example.backend.main.service.ArtworkService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ArtworkServiceImpl implements ArtworkService {

    @Resource
    private ArtworkDao artworkDao;

    @Override
    public List<Artwork> getArtworks() {
        return artworkDao.selectAllArtwork();
    }

    @Override
    public boolean addArtwork(Artwork artwork) {
        return artworkDao.addArtwork(artwork) != 0;
    }

    @Override
    public int deleteArtworkByName(String name) {
        return artworkDao.deleteArtworkByName(name);
    }

    @Override
    public int deleteArtWorkById(int id) {
        return artworkDao.deleteArtWorkById(id);
    }
}
