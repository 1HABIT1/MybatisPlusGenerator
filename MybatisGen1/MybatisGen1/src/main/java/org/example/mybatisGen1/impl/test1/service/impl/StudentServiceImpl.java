package org.example.mybatisGen1.impl.test1.service.impl;

import org.example.mybatisGen1.impl.test1.entity.Student;
import org.example.mybatisGen1.impl.test1.mapper.StudentMapper;
import org.example.mybatisGen1.impl.test1.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @auther liuH
 * @create 2022-02-25 22:11:23
 * @describe 服务实现类
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

}
