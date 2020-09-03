package com.cookie.mybatis.config;

/**
 * @author sunBing
 * @version 1.0
 * @date 2020/08/31 9:59
 */

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "timeout")
public class GameVo {
    private int betting;

    private int gaming;

    private int payout;

    private int halt;

    public int getBetting() {
        return betting;
    }

    public void setBetting(int betting) {
        this.betting = betting;
    }

    public int getGaming() {
        return gaming;
    }

    public void setGaming(int gaming) {
        this.gaming = gaming;
    }

    public int getPayout() {
        return payout;
    }

    public void setPayout(int payout) {
        this.payout = payout;
    }

    public int getHalt() {
        return halt;
    }

    public void setHalt(int halt) {
        this.halt = halt;
    }
}
