package me.thalles.spotjava.spotjava.repository;

import me.thalles.spotjava.spotjava.entity.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SongsRepository {
    List<Song> findAll();
}
