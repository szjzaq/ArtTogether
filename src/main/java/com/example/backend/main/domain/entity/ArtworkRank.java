package com.example.backend.main.domain.entity;

public class ArtworkRank {
    private Integer id;
    private Integer artworkId;
    private Integer point;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getArtworkId() {
        return artworkId;
    }

    public void setArtworkId(Integer artworkId) {
        this.artworkId = artworkId;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "ArtworkRank{" +
                "id=" + id +
                ", artworkId=" + artworkId +
                ", point=" + point +
                '}';
    }
}
