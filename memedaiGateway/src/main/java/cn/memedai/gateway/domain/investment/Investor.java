package cn.memedai.gateway.domain.investment;

import cn.memedai.gateway.domain.auth.User;
import cn.memedai.gateway.domain.bid.Bid;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Johnson on 7/8/14.
 */
public class Investor extends User {
    private Integer gender;
    private String name;
    private List<Bid> bidHistories = new ArrayList<>();

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Bid> getBidHistories() {
        return bidHistories;
    }

    public void setBidHistories(List<Bid> bidHistories) {
        this.bidHistories = bidHistories;
    }

    public void bid(Bid bid) {

    }
}
