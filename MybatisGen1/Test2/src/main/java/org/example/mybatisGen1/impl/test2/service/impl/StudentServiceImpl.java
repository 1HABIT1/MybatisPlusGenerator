package org.example.mybatisGen1.impl.test2.service.impl;

import org.example.mybatisGen1.impl.test2.entity.Student;
import org.example.mybatisGen1.impl.test2.mapper.StudentMapper;
import org.example.mybatisGen1.impl.test2.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @auther liuH
 * @create 2022-03-01 21:39:37
 * @describe 服务实现类
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

}
