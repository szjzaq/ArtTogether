package com.example.backend.main.controller;


import com.example.backend.main.domain.dto.ReturnStructure;
import com.example.backend.main.domain.entity.Gallery;
import com.example.backend.main.service.GalleryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/gallery")
public class GalleryController {

    @Resource
    private GalleryService galleryService;

    @GetMapping("/getGallery")
    private ReturnStructure getAllGalleries(){
        int code;
        String message;
        Map<String, Object> map = new HashMap<>();
        List<Gallery> galleries = galleryService.selectAllGallery();
        if (galleries!=null){
            code = 200;
            message = "success";
            map.put("galleries",galleries);
        }else {
            code = 404;
            message = "error";
        }
        return new ReturnStructure(code,message,map);
    }

    @PostMapping("/addGallery")
    private ReturnStructure addGallery(@RequestBody Gallery gallery){
        int code;
        String message;
        Map<String, Object> map = new HashMap<>();
        int flag = galleryService.addGallery(gallery);
        if (flag != 0){
            code = 200;
            message = "success";
            map.put("gallery",gallery);
        }else{
            code = 404;
            message = "error";
        }
        return new ReturnStructure(code,message,map);
    }

    @PostMapping("/deleteGalleryById")
    private ReturnStructure deletedGallery(@RequestBody int id){
        int code;
        String message;
        Map<String, Object> map = new HashMap<>();
        int flag = galleryService.deleteGalleryById(id);
        if (flag != 0){
            code = 200;
            message = "success";
            map.put("gallery",id);
        }else{
            code = 404;
            message = "error";
        }
        return new ReturnStructure(code,message,map);
    }

    @PostMapping("/deleteGalleryByName")
    private ReturnStructure deletedGallery(@RequestBody String name){
        int code;
        String message;
        Map<String, Object> map = new HashMap<>();
        int flag = galleryService.deleteGalleryByName(name);
        if (flag != 0){
            code = 200;
            message = "success";
            map.put("gallery",name);
        }else{
            code = 404;
            message = "error";
        }
        return new ReturnStructure(code,message,map);
    }

    @PostMapping("/updateGallery")
    private ReturnStructure updateGallery(@RequestBody Gallery gallery){
        int code;
        String message;
        Map<String, Object> map = new HashMap<>();
        int flag = galleryService.updateGalleryByName(gallery);
        if (flag != 0){
            code = 200;
            message = "success";
            map.put("gallery",gallery);
        }else{
            code = 404;
            message = "error";
        }
        return new ReturnStructure(code,message,map);
    }


}
