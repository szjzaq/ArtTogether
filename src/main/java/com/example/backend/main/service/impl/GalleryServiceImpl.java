package com.example.backend.main.service.impl;

import com.example.backend.main.dao.GalleryDao;
import com.example.backend.main.domain.entity.Gallery;
import com.example.backend.main.service.GalleryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GalleryServiceImpl implements GalleryService {

    @Resource
    private GalleryDao galleryDao;

    @Override
    public List<Gallery> selectAllGallery() {
        return galleryDao.selectAllGallery();
    }

    @Override
    public int addGallery(Gallery gallery) {
        return galleryDao.addGallery(gallery);
    }

    @Override
    public int deleteGalleryById(Integer id) {
        return galleryDao.deleteGalleryById(id);
    }

    @Override
    public int deleteGalleryByName(String name) {
        return galleryDao.deleteGalleryByName(name);
    }

    @Override
    public int updateGalleryByName(Gallery gallery) {
        return galleryDao.updateGalleryByName(gallery);
    }
}
