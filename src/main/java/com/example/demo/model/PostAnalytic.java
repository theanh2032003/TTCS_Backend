package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostAnalytic {
    @Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long likeCount;

    @OneToOne
    @MapsId
    @JoinColumn(name="post_id")
    private Post post;

    public PostAnalytic(Long likeCount, Post post) {
        this.likeCount = likeCount;
        this.post = post;
    }
}
