package com.green.greengramver.feed.model;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Slf4j
public class FeedGetRes {
    private long feedId;
    private long writerUserId;
    private String writerNm;
    private String writerPic;
    private String createdAt;
    private String contents;
    private String location;
    private int isLIKE;

    private List<String> pics = new ArrayList<>();
}
