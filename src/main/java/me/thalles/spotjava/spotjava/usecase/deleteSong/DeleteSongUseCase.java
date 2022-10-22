package me.thalles.spotjava.spotjava.usecase.deleteSong;

import me.thalles.spotjava.spotjava.entity.Song;
import me.thalles.spotjava.spotjava.exceptions.SongNotFoundException;
import me.thalles.spotjava.spotjava.repository.SongsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class DeleteSongUseCase {
    private final SongsRepository songsRepository;

    @Autowired
    public DeleteSongUseCase(SongsRepository songsRepository) {
        this.songsRepository = songsRepository;
    }

    public void delete(Long id) {
        Optional<Song> song = this.songsRepository.findById(id);

        if (song.isEmpty()) throw new SongNotFoundException();

        this.songsRepository.deleteById(id);
    }
}