package com.hs.hsblog_backend.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hs.hsblog_backend.entity.Blog;
import com.hs.hsblog_backend.model.vo.BlogListItem;
import com.hs.hsblog_backend.service.BlogService;
import com.hs.hsblog_backend.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Hs
 * @Date 2021/12/3 20:08
 */
@RestController
public class BlogController {
    @Autowired
    BlogService blogService;

    @RequestMapping("/getAllBlogs")
    public Result<PageInfo<BlogListItem>> getAllBlog(){
        return Result.success(blogService.getAllBlog());
    }

    @RequestMapping("/getPageBlog")
    public Result<PageInfo<BlogListItem>> getPageBlog(@RequestParam(defaultValue = "1") int pageNum){
        PageInfo<BlogListItem> allBlog = blogService.getPageBlog(pageNum);
        return Result.success(allBlog);
    }

    @RequestMapping("/getBlogById")
    public Result<Blog> getBlogById(@RequestParam Integer id){
        Blog blogById = blogService.getBlogById(id);
        return Result.success(blogById);
    }
}
