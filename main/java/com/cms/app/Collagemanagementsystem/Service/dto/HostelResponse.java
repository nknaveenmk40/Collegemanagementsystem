package com.cms.app.Collagemanagementsystem.Service.dto;

public class HostelResponse {
    private String blockNumber;
    private int roomNumber;

    public String getBlockNumber(String blockNumber) {
        return this.blockNumber;
    }

    public void setBlockNumber(String blockNumber) {
        this.blockNumber = blockNumber;
    }

    public int getRoomNumber(int roomNumber) {
        return this.roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
}
