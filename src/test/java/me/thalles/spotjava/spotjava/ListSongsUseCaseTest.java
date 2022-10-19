package me.thalles.spotjava.spotjava;

import me.thalles.spotjava.spotjava.repository.SongsRepository;
import me.thalles.spotjava.spotjava.usecase.listsongs.ListSongsUseCase;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ListSongsUseCaseTest {

	@InjectMocks
	private ListSongsUseCase sut;

	@Mock
	private SongsRepository songsRepository;

	@Test
	void contextLoads() {
		this.sut.list();
	}

}
