package me.thalles.spotjava.spotjava.repository.implementation;

import me.thalles.spotjava.spotjava.entity.Song;
import me.thalles.spotjava.spotjava.repository.SongsRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SongsRepositoryImpl extends JpaRepository<Song, Long>, SongsRepository {

}
