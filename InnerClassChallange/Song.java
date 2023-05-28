package InnerClassChallange;

class SongList {
    private List<Song> songs;

    public SongList() {
        this.songs = new ArrayList<>();
    }

    public boolean add(Song song) {
        if (findSong(song.getTitle()) != null) {
            return false;
        }
        songs.add(song);
        return true;
    }

    public Song findSong(String title) {
        for (Song song : songs) {
            if (song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }

    public Song findSong(int trackNumber) {
        int index = trackNumber - 1;
        if (index >= 0 && index < songs.size()) {
            return songs.get(index);
        }
        return null;
    }
}

