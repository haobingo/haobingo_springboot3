package space.haobingo.authentication.mapper;

import org.apache.ibatis.annotations.Mapper;
import space.haobingo.authentication.domain.entity.SysRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author 15879
* @description 针对表【sys_role】的数据库操作Mapper
* @createDate 2024-02-04 17:33:47
* @Entity space.haobingo.authentication.entity.SysRole
*/
@Mapper
public interface SysRoleMapper extends BaseMapper<SysRole> {

}




