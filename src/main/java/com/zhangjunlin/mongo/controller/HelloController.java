package com.zhangjunlin.mongo.controller;

import com.zhangjunlin.mongo.entity.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Tony
 * @description
 * @createTime 2018/6/27 13:57
 */
@RestController()
@RequestMapping("/a")
public class HelloController {

    private static final Logger logger = LogManager.getLogger(HelloController.class);


    /**
     * mongodb template
     */
    @Autowired
    private MongoTemplate mongoTemplate;


    @ApiOperation(value = "测试")
    @ApiImplicitParam(name = "sb", value = "测试参数", paramType = "path", required = true, dataType = "String")
    @GetMapping(value = "/{sb}/b")
    @ResponseBody
    public String test(@PathVariable("sb") String s){
        logger.debug(s);
        logger.error("hello");
        return s;
    }

    @ApiOperation(value = "保存用户数据")
    @ApiImplicitParam(name = "user", value = "用户对象实体", required = true, dataType = "User")
    @PostMapping("/save")
    public User save(@RequestBody User user) {
        mongoTemplate.save(user);
        return user;
    }

    @ApiOperation(value = "查询数据")
    @GetMapping("/find")
    public List<User> find() {
        return mongoTemplate.findAll(User.class);
    }

}
