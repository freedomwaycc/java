package com.yn.javastream.domian;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName(value = "sys_user")
public class SysUser implements Serializable {
    @TableId
    private Long userId;

    private Long deptId;


    private String userName;

    private String password;

    private String nickName;
}
