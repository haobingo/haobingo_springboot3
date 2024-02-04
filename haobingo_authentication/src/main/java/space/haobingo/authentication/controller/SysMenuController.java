package space.haobingo.authentication.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;
import space.haobingo.authentication.domain.entity.SysMenu;
import space.haobingo.authentication.domain.entity.SysRole;
import space.haobingo.authentication.service.SysMenuService;
import space.haobingo.authentication.service.SysRoleService;
import space.haobingo.common.response.RespResult;

/**
 * @ Description： 系统菜单
 * @ Author： 程序员好冰
 * @ Date： 2024/02/04/21:03
 */
@RestController
@RequestMapping("sys/menu")
public class SysMenuController {
    @Resource
    SysMenuService sysMenuService;

    @GetMapping
    public RespResult list(){
        return RespResult.success(sysMenuService.list());
    }

    @PostMapping
    public RespResult add(@RequestBody SysMenu sysMenu){
        return sysMenuService.save(sysMenu)?RespResult.success("添加成功:"+sysMenu.getMenuName()):RespResult.error("添加失败"+sysMenu.getMenuName());
    }
}
