package me.thalles.spotjava.spotjava.usecase.deleteSong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteSongController {
    private final DeleteSongUseCase deleteSongUseCase;

    @Autowired
    public DeleteSongController(DeleteSongUseCase deleteSongUseCase) {
        this.deleteSongUseCase = deleteSongUseCase;
    }

    @DeleteMapping("/songs/{id}")
    public void handle(@PathVariable Long id) {
        this.deleteSongUseCase.delete(id);
    }
}