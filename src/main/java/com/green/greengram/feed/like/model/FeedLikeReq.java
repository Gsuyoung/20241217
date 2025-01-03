package com.green.greengram.feed.like.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Schema(title = "피드 좋아요 Toggle")
public class FeedLikeReq {
    @Schema(title = "피드 PK", example = "2", requiredMode = Schema.RequiredMode.REQUIRED)
    private long feedId;
    @JsonIgnore
    private long userId;
}
