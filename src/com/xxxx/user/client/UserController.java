package com.xxxx.user.client;

import com.xxxx.user.dto.request.AddUserRequest;
import com.xxxx.user.dto.request.DeleteUserRequest;
import com.xxxx.user.dto.request.UpdateUserPasswordRequest;
import com.xxxx.user.dto.response.AddUserResponse;
import com.xxxx.user.dto.response.DeleteUserResponse;
import com.xxxx.user.dto.response.UpdateUserPasswordResponse;
import com.xxxx.user.service.IUserOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 用户操作控制层接口实现
 */
@RestController
@RequestMapping("/user")
public class UserController implements IUserClient{

    @Autowired
    private IUserOperationService userOperationService;

    /**
     * 新增一个用户
     * @param request 新增用户请求对象
     * @return 操作结果
     */
    @PostMapping("/add")
    @Override
    public AddUserResponse addUser(@RequestBody AddUserRequest request){
        return userOperationService.addUser(request);
    }

    /**
     * 删除一个用户
     * @param request 删除用户请求对象
     * @return 操作结果
     */
    @DeleteMapping("/delete")
    @Override
    public DeleteUserResponse deleteUser(@RequestBody DeleteUserRequest request){
        return userOperationService.deleteUser(request);
    }

    /**
     * 修改用户密码
     * @param request 修改用户密码请求对象
     * @return 操作结果
     */
    @PutMapping("/updatePassword")
    @Override
    public UpdateUserPasswordResponse updateUserPassword(@RequestBody UpdateUserPasswordRequest request){
        return userOperationService.updateUserPassword(request);
    }
}