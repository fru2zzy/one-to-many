package com.manytomany.bidirectional.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "PostComment")
@Table(name = "post_comment")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PostComment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String review;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Post> posts = new ArrayList<>();

    public PostComment(String review) {
        this.review = review;
    }

    public void addToList(Post post) {
        posts.add(post);
    }
}
