package com.firstSpring.blog.repo;

import com.firstSpring.blog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post,Long> {
}
