package space.haobingo.authentication.mapper;

import org.apache.ibatis.annotations.Mapper;
import space.haobingo.authentication.domain.entity.SysMenu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author 15879
* @description 针对表【sys_menu】的数据库操作Mapper
* @createDate 2024-02-04 17:27:36
* @Entity space.haobingo.authentication.entity.SysMenu
*/
@Mapper
public interface SysMenuMapper extends BaseMapper<SysMenu> {

}




