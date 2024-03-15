package dev.ashwin.youtubecli.model;

import java.time.LocalDateTime;

public record Snippet(String title, LocalDateTime publishedAt, String description) {
}
