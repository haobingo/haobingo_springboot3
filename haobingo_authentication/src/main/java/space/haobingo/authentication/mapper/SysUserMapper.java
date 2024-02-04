package space.haobingo.authentication.mapper;

import org.apache.ibatis.annotations.Mapper;
import space.haobingo.authentication.domain.entity.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author 15879
* @description 针对表【sys_user(后台用户表)】的数据库操作Mapper
* @createDate 2024-02-04 17:22:43
* @Entity space.haobingo.authentication.entity.SysUser
*/
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {

}




