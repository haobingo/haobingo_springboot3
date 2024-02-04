package space.haobingo.authentication.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import space.haobingo.authentication.domain.entity.SysUser;
import space.haobingo.authentication.service.SysUserService;
import space.haobingo.authentication.mapper.SysUserMapper;
import org.springframework.stereotype.Service;

/**
* @author 15879
* @description 针对表【sys_user(后台用户表)】的数据库操作Service实现
* @createDate 2024-02-04 17:22:43
*/
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser>
    implements SysUserService{

}




