package service;

import by.korzun.vanilla_console_app.domain.Playlist;

import java.time.YearMonth;

public interface TrackHistoryService {
    Playlist getPlaylistOfTopTracksOfTheMonth(YearMonth month);
    Playlist getPlaylistOfTopTracksOfTheMonthWithoutCachedTracks(YearMonth month);
    Playlist getRandomTracks(YearMonth month);
}
