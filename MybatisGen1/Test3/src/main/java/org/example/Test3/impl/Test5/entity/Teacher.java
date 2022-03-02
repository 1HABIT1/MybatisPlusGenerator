package org.example.Test3.impl.Test5.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
* @auther liuH
* @create 2022-03-01 21:50:24
* @describe 实体类
*/
@TableName("teacher")
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value="Teacher对象", description="")
public class Teacher implements Serializable {

private static final long serialVersionUID = 1L;

@ApiModelProperty(value = "主键")
@TableId(value = "ID", type = IdType.UUID)
private String id;

@ApiModelProperty(value = "姓名")
@TableField("NAME")
private String name;

@ApiModelProperty(value = "年龄")
@TableField("AGE")
private Integer age;

@ApiModelProperty(value = "备注")
@TableField("REMARK")
private String remark;

@ApiModelProperty(value = "班级ID")
@TableField("CLASSID")
private String classid;


public String getId() {
    return id;
}

public Teacher setId(String id) {
    this.id = id;
    return this;
}

public String getName() {
    return name;
}

public Teacher setName(String name) {
    this.name = name;
    return this;
}

public Integer getAge() {
    return age;
}

public Teacher setAge(Integer age) {
    this.age = age;
    return this;
}

public String getRemark() {
    return remark;
}

public Teacher setRemark(String remark) {
    this.remark = remark;
    return this;
}

public String getClassid() {
    return classid;
}

public Teacher setClassid(String classid) {
    this.classid = classid;
    return this;
}

@Override
public String toString() {
return "Teacher{" +
        "id=" + id +
        ", name=" + name +
        ", age=" + age +
        ", remark=" + remark +
        ", classid=" + classid +
"}";
}
}