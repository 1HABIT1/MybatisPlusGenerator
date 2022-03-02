package org.example.Test3.impl.Test4.service.impl;

import org.example.Test3.impl.Test4.entity.Student;
import org.example.Test3.impl.Test4.mapper.StudentMapper;
import org.example.Test3.impl.Test4.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @auther liuH
 * @create 2022-03-01 21:44:08
 * @describe 服务实现类
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

}
