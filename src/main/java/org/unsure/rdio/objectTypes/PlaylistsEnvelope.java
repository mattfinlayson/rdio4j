package org.unsure.rdio.objectTypes;

public class PlaylistsEnvelope {
    private String status;
    private PlaylistResults result;

    public PlaylistResults getResult() {
        return result;
    }

    public void setResult(PlaylistResults result) {
        this.result = result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
