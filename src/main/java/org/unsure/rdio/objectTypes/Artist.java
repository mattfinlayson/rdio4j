package org.unsure.rdio.objectTypes;

public class Artist {
    private String userName;    // Not in the spec man
    private String userKey;     // ditto
    private String name;        // the name of the artist
    private String key;         // the artist's key
    private String artistKey;   // Not in the spec man
    private String type;        // the object type, always "r"
    private String url;         // the URL of the artist on the Rdio web site
    private String artistUrl;   // Not in the spec man
    private long length;        // the number of tracks that the artist has on Rdio
    private String icon;        // an image for the artist
    private String  baseIcon;   // an image for the artist, partial URL
    private boolean hasRadio;    // is a station available for the artist?
    private String shortUrl;    // a short URL for the artist page
    private String radioKey;    // the key of the station for artist recommendations
    private String topSongsKey; // the key of the station for the artist's top songs

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getArtistKey() {
        return artistKey;
    }

    public void setArtistKey(String artistKey) {
        this.artistKey = artistKey;
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

    public String getUserKey() {
        return userKey;
    }

    public void setUserKey(String userKey) {
        this.userKey = userKey;
    }

    public String getArtistUrl() {
        return artistUrl;
    }

    public void setArtistUrl(String artistUrl) {
        this.artistUrl = artistUrl;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
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

    public boolean isHasRadio() {
        return hasRadio;
    }

    public void setHasRadio(boolean hasRadio) {
        this.hasRadio = hasRadio;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public String getRadioKey() {
        return radioKey;
    }

    public void setRadioKey(String radioKey) {
        this.radioKey = radioKey;
    }

    public String getTopSongsKey() {
        return topSongsKey;
    }

    public void setTopSongsKey(String topSongsKey) {
        this.topSongsKey = topSongsKey;
    }
}
