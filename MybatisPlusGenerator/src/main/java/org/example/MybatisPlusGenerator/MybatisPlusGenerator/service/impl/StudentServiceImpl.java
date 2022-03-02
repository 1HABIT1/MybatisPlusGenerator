package org.example.MybatisPlusGenerator.MybatisPlusGenerator.service.impl;

import org.example.MybatisPlusGenerator.MybatisPlusGenerator.entity.Student;
import org.example.MybatisPlusGenerator.MybatisPlusGenerator.mapper.StudentMapper;
import org.example.MybatisPlusGenerator.MybatisPlusGenerator.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @auther liuH
 * @create 2022-03-01 22:53:25
 * @describe 服务实现类
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

}
