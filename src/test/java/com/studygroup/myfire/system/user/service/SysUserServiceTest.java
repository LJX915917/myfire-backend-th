package com.studygroup.myfire.system.user.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.studygroup.myfire.backend.MyFireBackendApplication;
import com.studygroup.myfire.component.db.factory.pojo.PageResult;
import com.studygroup.myfire.system.api.pojo.request.SysUserRequest;
import com.studygroup.myfire.system.user.domain.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户业务测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyFireBackendApplication.class)
@Transactional
@Rollback(value = false)
public class SysUserServiceTest {

    @Resource
    private SysUserService sysUserService;

    @Test
    public void testAdd() {
        SysUserRequest request = new SysUserRequest();
        request.setAccount("mlx");
        request.setPassword("mlx520kym");
        sysUserService.add(request);
    }

    @Test
    public void testDel() {
        SysUserRequest request = new SysUserRequest();
        request.setUserId( 1736725141111496706L);
        sysUserService.del(request);
    }

    @Test
    public void testEdit() {
        SysUserRequest request = new SysUserRequest();
        request.setUserId(1736725940575162369L);
        request.setNickName("ljx");

        sysUserService.edit(request);
    }

    @Test
    public void testFindPage() {
        SysUserRequest request = new SysUserRequest();
//        request.setPageSize(1);
        request.setAccount("ljx");

        PageResult<SysUser> pageResult = sysUserService.findPage(request);
        System.out.println(pageResult.getPageNo());
        System.out.println(pageResult.getPageSize());

        List<SysUser> records = pageResult.getRows();
        for (SysUser record : records) {
            System.out.println(record);
        }
    }



}
