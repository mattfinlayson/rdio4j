/*
 * (c) 2011 Rdio Inc
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.rdio.simple.examples;

import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.StringWriter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.sun.tools.javac.util.Paths;
import org.apache.commons.io.IOUtils;
import org.json.*;

import com.rdio.simple.*;
import org.unsure.rdio.objectTypes.*;

public final class CommandLine {
    public static void main(String[] args) throws IOException, JSONException {
        ConsumerCredentials consumerCredentials = new ConsumerCredentials();
        RdioClient rdio = new RdioCoreClient(consumerCredentials);

        try {
            RdioClient.AuthState authState = rdio.beginAuthentication("oob");
            //System.out.println("Go to: " + authState.url);
            //System.out.print("Then enter the code: ");
            //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            //String verifier = reader.readLine().trim();
            //RdioClient.Token accessToken = rdio.completeAuthentication(verifier, authState.requestToken);
            RdioClient.Token token = new RdioClient.Token("d9snqkh79a5av5n4hss6bnf4zpwvq38rbkhmc2gpxjybxp6qjday8gud6sbah2fn", "82rxj84dr5zA");
            rdio = new RdioCoreClient(consumerCredentials, token);

            try {
                XmlMapper xmlMapper = new XmlMapper();
                String iTunesLibrary = readFile("/Users/matt/iTunesLibrary.xml");


                /*String temp = rdio.call("getPlaylists");
                ObjectMapper mapper = new ObjectMapper();
                PlaylistsEnvelope playlistsEnvelope = mapper.readValue(temp, PlaylistsEnvelope.class);
                PlaylistResults playlistResults = (PlaylistResults) playlistsEnvelope.getResult();
                for (Playlist owned : playlistResults.getOwned()) {
                    System.out.print(owned.getName() + " - " + owned.getShortUrl() + "\n");
                }

                String rawArtists = rdio.call("getArtistsInCollection");
                ArtistsEnvelope artistsEnvelope = mapper.readValue(rawArtists, ArtistsEnvelope.class);
                List<Artist> artists = artistsEnvelope.getResult();

                for(Artist artist : artists) {
                    if(!artist.isHasRadio()) {
                        System.out.println(artist.getName() + " - " + artist.getShortUrl());
                    }
                }
                System.out.println(artists.size());  */


            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (RdioClient.RdioException e) {
            System.err.println("Rdio Error: " + e.toString());
        }
    }

    public static String readFile(String fileName) throws IOException {

        StringWriter stringWriter = new StringWriter();
        IOUtils.copy(new FileInputStream(new File(fileName)), stringWriter);

        return stringWriter.toString();
    }
}
