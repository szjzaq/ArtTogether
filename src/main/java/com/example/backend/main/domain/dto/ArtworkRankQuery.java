package com.example.backend.main.domain.dto;

public class ArtworkRankQuery {

    private String artworkId;

    private int point;

    public String getArtworkId() {
        return artworkId;
    }

    public void setArtworkId(String artworkId) {
        this.artworkId = artworkId;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }


    @Override
    public String toString() {
        return "ArtworkRankQuery{" +
                "artworkId='" + artworkId + '\'' +
                ", point=" + point +
                '}';
    }
}
