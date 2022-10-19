package me.thalles.spotjava.spotjava.repository;

import me.thalles.spotjava.spotjava.entity.Song;

import java.util.List;

public interface SongsRepository {
    List<Song> findAll();
}
