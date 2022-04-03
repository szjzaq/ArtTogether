package com.example.backend.main.controller;


import com.example.backend.main.dao.ArtworkRankDao;
import com.example.backend.main.domain.dto.ArtworkRankQuery;
import com.example.backend.main.domain.dto.ReturnStructure;
import com.example.backend.main.domain.entity.ArtworkRank;
import com.example.backend.main.service.ArtworkRankService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/artworkRank")
public class ArtworkRankController {

    @Resource
    private ArtworkRankService artworkRankService;

    @GetMapping("/getArtworkRanks")
    private ReturnStructure getArtworkRanks(){
        int code;
        String message;
        Map<String, Object> map = new HashMap<>();
        List<ArtworkRankQuery> artworkRankQueries = artworkRankService.getRanks();
        if (artworkRankQueries != null){
            code = 200;
            message = "success";
            map.put("artworkRanks",artworkRankQueries);
        }else{
            code = 404;
            message = "error";
        }
        return new ReturnStructure(code,message,map);
    }

    @PostMapping("/addArtworkRanks")
    private ReturnStructure addArtworkPoint(@RequestBody int artworkId){
        int code;
        String message;
        Map<String, Object> map = new HashMap<>();
        int flag = artworkRankService.addArtPointById(artworkId);
        if (flag != 0){
            code = 200;
            message = "success";
            map.put("artworkRanks",artworkId);
        }else{
            code = 404;
            message = "error";
        }
        return new ReturnStructure(code,message,map);
    }
}
