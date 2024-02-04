package space.haobingo.authentication.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;
import space.haobingo.authentication.domain.entity.SysUser;
import space.haobingo.authentication.service.SysUserService;
import space.haobingo.common.response.RespResult;

/**
 * @ Description： 系统用户测试类
 * @ Author： 程序员好冰
 * @ Date： 2024/02/04/17:30
 */

@RestController
@RequestMapping("sys/user")
public class SysUserController {

    @Resource
     SysUserService sysUserService;
    @GetMapping
    public RespResult list(){
        return RespResult.success(sysUserService.list());
    }

    @PostMapping
    public RespResult add(@RequestBody SysUser sysUser){
        return sysUserService.save(sysUser)?RespResult.success("添加成功:"+sysUser.getUsername()):RespResult.error("添加失败"+sysUser.getUsername());
    }
}
