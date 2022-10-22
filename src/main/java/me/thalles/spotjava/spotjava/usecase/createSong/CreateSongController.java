package me.thalles.spotjava.spotjava.usecase.createSong;

import me.thalles.spotjava.spotjava.entity.Song;
import me.thalles.spotjava.spotjava.usecase.createSong.dtos.CreateSongDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateSongController {
    private final CreateSongUseCase createSongUseCase;

    @Autowired
    public CreateSongController(CreateSongUseCase createSongUseCase) {
        this.createSongUseCase = createSongUseCase;
    }

    @PostMapping("/songs")
    public Song handle(@RequestBody CreateSongDTO createSongDTO) {
        return this.createSongUseCase.create(createSongDTO.toSong());
    }
}