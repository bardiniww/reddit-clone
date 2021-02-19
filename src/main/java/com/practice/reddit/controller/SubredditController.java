package com.practice.reddit.controller;

import com.practice.reddit.dto.SubredditDTO;
import com.practice.reddit.service.SubredditService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/subreddit")
@AllArgsConstructor
@Slf4j
public class SubredditController {

    private final SubredditService subredditService;

    @PostMapping
    public ResponseEntity<SubredditDTO> createSubreddit(@RequestBody SubredditDTO subredditDTO) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(subredditService.save(subredditDTO));
    }

    @GetMapping
    public ResponseEntity<List<SubredditDTO>> getAllSubreddits() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(subredditService.getAll());
    }
}
