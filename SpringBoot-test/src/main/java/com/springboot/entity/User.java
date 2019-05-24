package com.springboot.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.springboot.base.BaseEntity;
import lombok.Data;

import java.io.Serializable;

/**
 * <ul>
 * <li>项目名称：MyTest</li>
 * <li>文件名称：User</li>
 * <li>@author：张浩</li>
 * <li>日期：2019年04月09日 14时15分</li>
 * <li>Copyright ©2017, 广州职赢未来信息科技有限公司 All Rights Reserved.</li>
 * </ul>
 */
@Data
@TableName(value = "ZH_USER")
public class User extends BaseEntity<User> {
    private static final long serialVersionUID = 1L;
    @TableId("id")
    private String id;
    private String name;
    private Integer age;
    private String email;
    private String status;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}