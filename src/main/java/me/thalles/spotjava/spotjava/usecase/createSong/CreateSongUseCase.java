package me.thalles.spotjava.spotjava.usecase.createSong;

import me.thalles.spotjava.spotjava.entity.Song;
import me.thalles.spotjava.spotjava.repository.SongsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateSongUseCase {
    private final SongsRepository songsRepository;

    @Autowired
    public CreateSongUseCase(SongsRepository songsRepository) {
        this.songsRepository = songsRepository;
    }

    public Song create(Song song) {
        return this.songsRepository.save(song);
    }
}