package com.cookie.mybatis.model;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@ApiModel
@AllArgsConstructor
@NoArgsConstructor
public class Chip {
    /**
     * 筹码面值
     */
    private double denomination;
    /**
     * 筹码数量
     */
    private double count;
    /**
     * 筹码类型
     */
    private String type;
}
