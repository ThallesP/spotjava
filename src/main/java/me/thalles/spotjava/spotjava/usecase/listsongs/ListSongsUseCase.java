package me.thalles.spotjava.spotjava.usecase.listsongs;
import me.thalles.spotjava.spotjava.entity.Song;
import me.thalles.spotjava.spotjava.repository.SongsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ListSongsUseCase {
    private final SongsRepository songsRepository;

    @Autowired
    public ListSongsUseCase(SongsRepository songsRepository) {
        this.songsRepository = songsRepository;
    }

    public List<Song> list() {
        return this.songsRepository.findAll();
    }
}
