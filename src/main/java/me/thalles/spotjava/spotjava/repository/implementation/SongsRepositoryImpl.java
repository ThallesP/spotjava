package me.thalles.spotjava.spotjava.repository.implementation;

import me.thalles.spotjava.spotjava.entity.Song;
import me.thalles.spotjava.spotjava.repository.SongsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component()
public class SongsRepositoryImpl implements SongsRepository {
    @Autowired
    private JpaRepository<Song, Long> _repository;

    @Override
    public List<Song> findAll() {
        return this._repository.findAll();
    }
}
