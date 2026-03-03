package com.example.movieservice.domain.model;

import java.time.LocalDateTime;

/**
 * Modelo de domínio representando um filme favoritado por um usuário.
 */
public record Favorite(
	Long id,
	Long movieId,
	Long userId,
	String title,
	String posterPath,
	String overview,
	Double voteAverage,
	LocalDateTime createdAt
) {
}
