package me.thalles.spotjava.spotjava.usecase.listsongs;

import me.thalles.spotjava.spotjava.entity.Song;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ListSongsController {
    private final ListSongsUseCase listSongsUseCase;

    public ListSongsController(ListSongsUseCase listSongsUseCase) {
        this.listSongsUseCase = listSongsUseCase;
    }

    @GetMapping("/songs")
    public List<Song> handle() {
        return this.listSongsUseCase.list();
    }
}
