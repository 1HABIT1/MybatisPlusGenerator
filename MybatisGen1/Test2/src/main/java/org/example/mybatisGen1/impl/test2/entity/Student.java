package org.example.mybatisGen1.impl.test2.entity;

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
* @create 2022-03-01 21:39:37
* @describe 实体类
*/
@TableName("student")
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value="Student对象", description="")
public class Student implements Serializable {

private static final long serialVersionUID = 1L;

@ApiModelProperty(value = "主键")
@TableId(value = "ID", type = IdType.UUID)
private String id;

@ApiModelProperty(value = "姓名")
@TableField("NAME")
private String name;

@ApiModelProperty(value = "年纪")
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

public Student setId(String id) {
    this.id = id;
    return this;
}

public String getName() {
    return name;
}

public Student setName(String name) {
    this.name = name;
    return this;
}

public Integer getAge() {
    return age;
}

public Student setAge(Integer age) {
    this.age = age;
    return this;
}

public String getRemark() {
    return remark;
}

public Student setRemark(String remark) {
    this.remark = remark;
    return this;
}

public String getClassid() {
    return classid;
}

public Student setClassid(String classid) {
    this.classid = classid;
    return this;
}

@Override
public String toString() {
return "Student{" +
        "id=" + id +
        ", name=" + name +
        ", age=" + age +
        ", remark=" + remark +
        ", classid=" + classid +
"}";
}
}