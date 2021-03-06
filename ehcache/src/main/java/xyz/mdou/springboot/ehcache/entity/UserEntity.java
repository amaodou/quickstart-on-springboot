package xyz.mdou.springboot.ehcache.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@Data
@Accessors(chain = true)
public class UserEntity implements Serializable {

    private Long uid;

    private String name;

    private Date birthday;

    private Date createDate = new Date();

    private Date updateDate = new Date();

}
