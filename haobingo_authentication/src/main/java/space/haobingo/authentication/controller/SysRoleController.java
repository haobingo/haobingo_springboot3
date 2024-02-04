package space.haobingo.authentication.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;
import space.haobingo.authentication.domain.entity.SysRole;
import space.haobingo.authentication.service.SysRoleService;
import space.haobingo.common.response.RespResult;

/**
 * @ Description： 系统角色
 * @ Author： 程序员好冰
 * @ Date： 2024/02/04/20:09
 */
@RestController
@RequestMapping("sys/role")
public class SysRoleController {

    @Resource
    SysRoleService sysRoleService;

    @GetMapping
    public RespResult list(){
        return RespResult.success(sysRoleService.list());
    }

    @PostMapping
    public RespResult add(@RequestBody SysRole sysRole){
        return sysRoleService.save(sysRole)?RespResult.success("添加成功:"+sysRole.getRoleName()):RespResult.error("添加失败"+sysRole.getRoleName());
    }

}
