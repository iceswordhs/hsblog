package com.hs.hsblog_backend.repository;

import com.hs.hsblog_backend.entity.Blog;
import org.apache.ibatis.annotations.Mapper;
import com.hs.hsblog_backend.entity.Tag;

import java.util.List;

/**
 * @author Hs
 * @Date 2021/12/16 17:19
 */
@Mapper
public interface TagMapper {
    void updateTagById(Tag tag);

    List<Tag> getAllTag();

    Tag findByIdOrName(Tag tag);

    Integer addTag(Tag tag);

    void deleteTagById(Integer tagId);

    List<Tag> getTagByBlogId(Integer blogId);
}
