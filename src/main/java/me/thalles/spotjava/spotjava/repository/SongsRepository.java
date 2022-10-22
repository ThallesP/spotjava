package me.thalles.spotjava.spotjava.repository;

import me.thalles.spotjava.spotjava.entity.Song;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SongsRepository extends JpaRepository<Song, Long> {
}
