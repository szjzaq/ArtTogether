package com.example.backend.main.controller;


import com.example.backend.main.domain.dto.ReturnStructure;
import com.example.backend.main.domain.entity.Artwork;
import com.example.backend.main.service.ArtworkService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/artwork")
public class ArtworkController {
    @Resource
    private ArtworkService artworkService;

    @GetMapping("/getArtwork")
    private ReturnStructure getAllGalleries() {
        int code;
        String message;
        Map<String, Object> map = new HashMap<>();
        List<Artwork> artworks = artworkService.getArtworks();
        if (artworks != null) {
            code = 200;
            message = "success";
            map.put("artworks", artworks);
        } else {
            code = 404;
            message = "error";
        }
        return new ReturnStructure(code, message, map);
    }

    @PostMapping("/addArtwork")
    private ReturnStructure addArtwork(@RequestBody Artwork artwork) {
        int code;
        String message;
        Map<String, Object> map = new HashMap<>();
        int flag = artworkService.addArtwork(artwork);
        if (flag != 0) {
            code = 200;
            message = "success";
            map.put("artwork", artwork);
        } else {
            code = 404;
            message = "error";
        }
        return new ReturnStructure(code, message, map);
    }

    @PostMapping("/deleteArtworkByName")
    private ReturnStructure deleteArtwork(@RequestBody String name) {
        int code;
        String message;
        Map<String, Object> map = new HashMap<>();
        int flag = artworkService.deleteArtworkByName(name);
        if (flag != 0) {
            code = 200;
            message = "success";
            map.put("artwork", name);
        } else {
            code = 404;
            message = "error";
        }
        return new ReturnStructure(code, message, map);
    }

    @PostMapping("/deleteArtworkById")
    private ReturnStructure deleteArtwork(@RequestBody int id) {
        int code;
        String message;
        Map<String, Object> map = new HashMap<>();
        int flag = artworkService.deleteArtWorkById(id);
        if (flag != 0) {
            code = 200;
            message = "success";
            map.put("artwork", id);
        } else {
            code = 404;
            message = "error";
        }
        return new ReturnStructure(code, message, map);
    }

    @PostMapping("/deleteArtwork")
    private ReturnStructure deleteArtwork(@RequestBody Artwork artwork) {
        int code;
        String message;
        Map<String, Object> map = new HashMap<>();
        int flag = artworkService.updateArtwork(artwork);
        if (flag != 0) {
            code = 200;
            message = "success";
            map.put("artwork", artwork);
        } else {
            code = 404;
            message = "error";
        }
        return new ReturnStructure(code, message, map);
    }

}
