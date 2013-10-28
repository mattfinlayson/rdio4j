package org.unsure.rdio.objectTypes;

import java.util.List;

public class PlaylistResults {
    private List<Playlist> subscribed;
    private List<Playlist> owned;
    private List<Playlist> collab;

    public List<Playlist> getSubscribed() {
        return subscribed;
    }

    public void setSubscribed(List<Playlist> subscribed) {
        this.subscribed = subscribed;
    }

    public List<Playlist> getOwned() {
        return owned;
    }

    public void setOwned(List<Playlist> owned) {
        this.owned = owned;
    }

    public List<Playlist> getCollab() {
        return collab;
    }

    public void setCollab(List<Playlist> collab) {
        this.collab = collab;
    }
}
