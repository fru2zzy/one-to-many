package com.onetomany.unidirectional_JoinColumn.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
    @GeneratedValue
    private Long id;

    private String review;

    public PostComment(String review) {
        this.review = review;
    }
}
