package me.thalles.spotjava.spotjava.usecase.createSong.dtos;

import me.thalles.spotjava.spotjava.entity.Song;

public class CreateSongDTO {
  public String name;

  public String author;

  public Song toSong() {
      Song song = new Song();
      song.setAuthor(this.author);
      song.setName(this.name);

      return song;
  }
}