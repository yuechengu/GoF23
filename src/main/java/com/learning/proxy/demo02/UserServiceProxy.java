package com.learning.proxy.demo02;

public class UserServiceProxy implements UserService{

    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }

    @Override
    public void query() {
        log("query");
        userService.query();
    }

    // 加新业务进去，不影响原有的原生业务
    // AOP 面向切面编程的顶层逻辑 即代理模式
    public void log(String msg) {
        System.out.println("[debug] 使用了"+msg+"方法");
    }
}
