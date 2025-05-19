package com.dog.utils.mappers;


import com.dog.dto.response.PostResponse;
import com.dog.entities.Post;
import java.util.List;

public class PostMapper {

    public static Post toEntity(PostResponse postResponse) {
        return Post.builder()
                .id(postResponse.getPostId())
                .title(postResponse.getTitle())
                .price(postResponse.getPrice())
                .image(postResponse.getImage())
                .status(postResponse.getStatus())
                .user(UserMapper.toEntity(postResponse.getUser()))
                .room(RoomMapper.toEntity(postResponse.getRoom()))
                .build();
    }

    public static PostResponse toDTO(Post post) {
        return PostResponse.builder()
                .postId(post.getId())
                .title(post.getTitle())
                .price(post.getPrice())
                .image(post.getImage())
                .status(post.getStatus())
                .user(UserMapper.toDTO(post.getUser()))
                .room(RoomMapper.toDTO(post.getRoom()))
                .build();
    }

    public static List<PostResponse> toDTOList(List<Post> posts) {
        return posts.stream()
                .map(PostMapper::toDTO)
                .toList();
    }

}
