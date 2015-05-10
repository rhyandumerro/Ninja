package io.github.mthli.Ninja.Browser;

import android.os.Message;
import android.webkit.WebView;

public interface BrowserController {
    void updateBookmarks();

    void updateInputBox(String query);

    void updateProgress(int progress, boolean fromShow);

    void showAlbum(AlbumController albumController, boolean capture);

    void removeAlbum(AlbumController albumController);

    void onCreateView(WebView view, Message resultMsg);

    void onLongPress(String url);
}
