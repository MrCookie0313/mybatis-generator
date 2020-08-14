package com.cookie.mybatis.model;
import lombok.*;
import lombok.experimental.Accessors;

/**
 * @author sunbing_vendor
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {
    private Integer id;

    private String name;

    private Long sex;

}