package org.unsure.rdio.objectTypes;

public class Playlist {
    private String name;        // the name of the playlist
    private long length;        // the number of tracks in the playlist
    private String type;        // the object type, always "p"
    private String url;         // the URL of the playlist on the Rdio site
    private String icon;        // the URL of an icon for the playlist
    private String baseIcon;    // the URL of an icon for the playlist
    private String owner;       // the name of the user who created the playlist
    private String ownerUrl;    // the URL on the Rdio site of the user who created the playlist
    private String ownerKey;    // the key of the user who created the playlist
    private String ownerIcon;   // the icon of the user who created the playlist
    private String lastUpdated; // when the playlist was last modified
    private String shortUrl;    // a short URL for the playlist
    private String embedUrl;    // the URL of a SWF to embed the playlist
    private String key;         // the key of the playlist

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getBaseIcon() {
        return baseIcon;
    }

    public void setBaseIcon(String baseIcon) {
        this.baseIcon = baseIcon;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwnerUrl() {
        return ownerUrl;
    }

    public void setOwnerUrl(String ownerUrl) {
        this.ownerUrl = ownerUrl;
    }

    public String getOwnerKey() {
        return ownerKey;
    }

    public void setOwnerKey(String ownerKey) {
        this.ownerKey = ownerKey;
    }

    public String getOwnerIcon() {
        return ownerIcon;
    }

    public void setOwnerIcon(String ownerIcon) {
        this.ownerIcon = ownerIcon;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public String getEmbedUrl() {
        return embedUrl;
    }

    public void setEmbedUrl(String embedUrl) {
        this.embedUrl = embedUrl;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}

