package com.github.kilianB.example.player.fileHandling.exception;

public class NoSuitableAlbumFound extends MusicProviderException {

	private static final long serialVersionUID = 1L;

	public NoSuitableAlbumFound(String string) {
		super(string);
	}
	
	public NoSuitableAlbumFound(){
		super();
	};

}