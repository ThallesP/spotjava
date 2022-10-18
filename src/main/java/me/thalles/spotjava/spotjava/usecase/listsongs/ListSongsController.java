package me.thalles.spotjava.spotjava.usecase.listsongs;

import me.thalles.spotjava.spotjava.entity.Song;
import me.thalles.spotjava.spotjava.repository.SongsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ListSongsController {
    @Autowired
    private ListSongsUseCase _listSongsUseCase;

    @GetMapping("/songs")
    public List<Song> handle() {
        return this._listSongsUseCase.list();
    }
}
