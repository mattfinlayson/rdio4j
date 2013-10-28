package org.unsure.rdio.objectTypes;

import java.util.List;

public class ArtistsEnvelope {
    private String status;
    private List<Artist> result;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Artist> getResult() {
        return result;
    }

    public void setResult(List<Artist> result) {
        this.result = result;
    }
}
